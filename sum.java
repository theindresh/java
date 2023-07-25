import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number: ");
        int a = sc.nextInt();
        System.out.println("Enter Your Second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("2 Number add is : " +sum);
    }
}
