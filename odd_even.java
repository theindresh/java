import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int i = sc.nextByte();
        if (i % 2 == 0) {
            System.out.println("Enter Number is Even ");
        } else {
            System.out.println("Enter Number is Odd");
        }
    }
}
