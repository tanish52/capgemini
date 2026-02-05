import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] arr = null;

            if (n > 0) {
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
        }
        catch (NullPointerException e) {
            System.out.println("Array is null");
        }
        finally {
            sc.close();
        }
    }
}
