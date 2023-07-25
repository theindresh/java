import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Princple Amount: ");
        float p = sc.nextFloat();
        System.out.println("Enter intrest rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter Time: ");
        float t = sc.nextFloat();
        float intrest = (p*r*t)/100;
        System.out.println("Total Amount of Intrest is :" +intrest);

    }
}
