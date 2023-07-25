import java.util.Scanner;

public class ConditionPw {
    public static void main(String[] args) {
//        question 5

        char op;
        Double num1;
        Double num2;
        double ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an operator: (+, -, *, or /): ");
        op = sc.next().charAt(0);
        System.out.print("Enter first number : ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        num2 = sc.nextDouble();
        switch (op) {
            case '+' -> {
                ans = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + ans);
            }
            case '-' -> {
                ans = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + ans);
            }
            case '*' -> {
                ans = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + ans);
            }
            case '/' -> {
                ans = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + ans);
            }
            default -> System.out.println("Error! The operator is not correct");
        }


/*
        question 3
        Scanner sc = new Scanner(System.in);
        int cp;
        int sp;
        System.out.println("Enter Cost Price: ");
        cp = sc.nextInt();
        System.out.println("Enter Selling Price: ");
        sp = sc.nextInt();
        int amt;
        if (cp>sp){
            amt = cp-sp;
            System.out.println("the loss is : "+amt);
        } else if (cp<sp) {
            amt = sp-cp;
            System.out.println("The Profit is : "+amt);
        }else System.out.println("No profit No loss");
//        question 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Negativ number : ");
        int num = sc.nextInt();
        if(num < 0){
            int i = num * -1;
            System.out.println("Your Result is " +i);
        }else{
            System.out.println("Try Again ");
        }
//        question 1
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length : ");
        int length = sc.nextInt();
        System.out.println("Enter Breadth : ");
        int breadth = sc.nextInt();

        if(length == breadth){
            System.out.println("It is a square ");
        }else {
            System.out.println("Is is not square ");
        }
        System.out.print("Enter Your Number: ");
        int num1 = sc.nextInt();
        if(num1 >= 33){
            System.out.println("Pass");
        } else {
            System.out.println("fail");
        }
*/


    }
}

