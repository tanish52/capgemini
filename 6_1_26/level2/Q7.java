package level2;
import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            personData[i][0] = sc.nextDouble(); // weight
            personData[i][1] = sc.nextDouble(); // height

            personData[i][2] = personData[i][0] /
                              (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++)
            System.out.println(personData[i][1] + " " +
                               personData[i][0] + " " +
                               personData[i][2] + " " +
                               status[i]);
    }
}
