import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your radius : ");
        float r = sc.nextFloat();
        float area = (float) (3.14 * r * r);
        System.out.println(area);
    }
}
