import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num_1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int num_2 = sc.nextInt();
         int sum = num_1+num_2;
        System.out.println("The Sum is Two Number is : " +sum);

    }
}
