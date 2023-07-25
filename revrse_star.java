import java.util.Scanner;

public class revrse_star {
    public static void main(String[] args){
        System.out.println("Hello Indresh How Are You!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int line = 1; line <=n; line++){
            for(int star = 1; star <=(n-line+1); star++){
                System.out.print("*");

            }
            System.out.println( );
        }




    }
}
