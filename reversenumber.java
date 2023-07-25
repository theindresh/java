import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        int rem = 0 ,r1;
        System.out.println("Enter Your Number : " );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            r1 = n % 10;
            rem = rem*10+r1;
            n /= 10;
        }
        System.out.print("reverse number :" +rem);
    }
}
