import java.util.Scanner;

public class el_april {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x = sc.nextInt();
        if(x>0){
            System.out.println("The  Number is positive : "+x);
        }
        else
            System.out.println("The number is negative :  "+x);
    }

}
