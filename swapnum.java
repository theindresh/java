import java.util.Scanner;

public class swapnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.println("The first Number is:"+num1);
        System.out.println("The Second Number is:"+num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The first swap number is:" +num1);
        System.out.println("The second swap number is :" +num2);
    }
}
