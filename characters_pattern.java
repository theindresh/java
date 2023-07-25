import java.util.Scanner;

public class characters_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter How many number want you print : ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int line = 1; line<=n; line++){
            for(int chars = 1; chars<=line; chars++){
                System.out.print(" " +ch);
                ch++;
            }
            System.out.println( );
        }
    }
}
