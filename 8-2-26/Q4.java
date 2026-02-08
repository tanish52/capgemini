import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String claimId;
    String policyNumber;
    double claimAmount;
    Date claimDate;
    String status;

    public Claim(String claimId, String policyNumber, double claimAmount, Date claimDate, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.status = status;
    }

    public String getPolicyNumber() { return policyNumber; }
    public double getClaimAmount() { return claimAmount; }
    public String getStatus() { return status; }
}

class PolicySummary {
    String policyNumber;
    double totalAmount;
    double averageAmount;

    public PolicySummary(String policyNumber, double totalAmount, double averageAmount) {
        this.policyNumber = policyNumber;
        this.totalAmount = totalAmount;
        this.averageAmount = averageAmount;
    }

    @Override
    public String toString() {
        return "Policy " + policyNumber + ": Total = $" + totalAmount + ", Average = $" + averageAmount;
    }
}

public class Q4 {

    public static List<PolicySummary> getTopPolicies(List<Claim> claims, int topN) {
        
        List<Claim> filtered = claims.stream()
                .filter(c -> c.getStatus().equalsIgnoreCase("Approved") && c.getClaimAmount() > 5000)
                .collect(Collectors.toList());

       
        Map<String, List<Claim>> grouped = filtered.stream()
                .collect(Collectors.groupingBy(Claim::getPolicyNumber));

        List<PolicySummary> summaries = grouped.entrySet().stream()
                .map(entry -> {
                    String policyNumber = entry.getKey();
                    double total = entry.getValue().stream().mapToDouble(Claim::getClaimAmount).sum();
                    double average = entry.getValue().stream().mapToDouble(Claim::getClaimAmount).average().orElse(0);
                    return new PolicySummary(policyNumber, total, average);
                })
                .sorted((p1, p2) -> Double.compare(p2.totalAmount, p1.totalAmount)) 
                .limit(topN)
                .collect(Collectors.toList());

        return summaries;
    }

    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("C001", "P001", 6000, new Date(), "Approved"),
            new Claim("C002", "P002", 8000, new Date(), "Approved"),
            new Claim("C003", "P001", 7000, new Date(), "Approved"),
            new Claim("C004", "P003", 3000, new Date(), "Approved"),
            new Claim("C005", "P002", 4000, new Date(), "Pending"),
            new Claim("C006", "P004", 12000, new Date(), "Approved"),
            new Claim("C007", "P003", 9000, new Date(), "Approved"),
            new Claim("C008", "P002", 5000, new Date(), "Approved")
        );

        List<PolicySummary> topPolicies = getTopPolicies(claims, 3);

        System.out.println("Top 3 Policies with highest total claim amounts:");
        topPolicies.forEach(System.out::println);
    }
}
