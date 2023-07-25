import java.util.Scanner;

public class Enter_Input {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter your First Name : ");
        String First = In.next();
        System.out.println("Enter Your Second Name :");
        String Second = In.next();
        String sum = First+Second;
        System.out.println("Your Name is : " +sum);


    }
}
