import java.util.*;
import java.util.stream.Collectors;

class PolicyHolder {
    String holderId;
    String name;
    int age;
    String policyType;
    double premiumAmount;

    public PolicyHolder(String holderId, String name, int age, String policyType, double premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }
}

class RiskAssessment {
    String holderId;
    String name;
    double riskScore;

    public RiskAssessment(String holderId, String name, double riskScore) {
        this.holderId = holderId;
        this.name = name;
        this.riskScore = riskScore;
    }

    @Override
    public String toString() {
        return name + " (" + holderId + ") - Risk Score: " + String.format("%.2f", riskScore);
    }
}

public class  Q5{

    public static Map<String, List<RiskAssessment>> assessRisk(List<PolicyHolder> holders) {
        
        List<RiskAssessment> assessments = holders.stream()
                .filter(h -> h.policyType.equalsIgnoreCase("Life") && h.age > 60)
                .map(h -> new RiskAssessment(h.holderId, h.name, h.premiumAmount / h.age))
                .sorted((r1, r2) -> Double.compare(r2.riskScore, r1.riskScore))
                .collect(Collectors.toList());

        
        return assessments.stream()
                .collect(Collectors.groupingBy(r -> r.riskScore > 0.5 ? "High Risk" : "Low Risk"));
    }

    public static void main(String[] args) {
        List<PolicyHolder> holders = Arrays.asList(
                new PolicyHolder("H001", "Alice", 65, "Life", 40),
                new PolicyHolder("H002", "Bob", 70, "Life", 20),
                new PolicyHolder("H003", "Charlie", 62, "Life", 50),
                new PolicyHolder("H004", "David", 58, "Life", 60),
                new PolicyHolder("H005", "Eve", 75, "Health", 30),
                new PolicyHolder("H006", "Frank", 68, "Life", 25)
        );

        Map<String, List<RiskAssessment>> result = assessRisk(holders);

       
        result.forEach((category, list) -> {
            System.out.println(category + ":");
            list.forEach(System.out::println);
            System.out.println();
        });
    }
}
