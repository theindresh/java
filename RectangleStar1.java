import java.util.Scanner;

public class RectangleStar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols, i, j;
        System.out.println("Enter The Rows No: ");
        rows = sc.nextInt();
        System.out.println("Enter The cols No: ");
        cols = sc.nextInt();
        for(i=1;i<=rows;i++){
            for(j=1;j<=cols;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
