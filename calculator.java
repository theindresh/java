import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double num1, num2, output = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        num1 = sc.nextDouble();
        System.out.println("Enter Second Number : ");
        num2 = sc.nextDouble();
        System.out.println("Enter An Any Operator (+,-,/,*) : ");
        char operator = sc.next().charAt(0);
        sc.close();

        switch (operator) {
            case '+' -> output = num1 + num2;
            case '-' -> output = num1 - num2;
            case '*' -> output = num1 * num2;
            case '/' -> output = num1 / num2;
            default -> System.out.println("Enter Valid Operator : ");
        }
        System.out.println(num1 +" "+operator+" " +num2 + "=" +output);
    }
}
