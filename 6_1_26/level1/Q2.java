import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                if(numbers[i] % 2 == 0){
                    System.out.println("Even");
                }else{
                    System.out.println("Odd");
                }
            }else if(numbers[i] == 0){
                System.out.println("Zero");
            }else{
                System.out.println("Negative");
            }
        }

        if(numbers[0] == numbers[numbers.length-1]){
            System.out.println("Yes they are equal");
        }
             else if (numbers[0] > numbers[numbers.length - 1])
            System.out.println("First element is Greater");
        else
            System.out.println("Last element is Greater");
    }
}    