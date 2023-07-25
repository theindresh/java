import java.util.*;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i<= n /2; i++){
            if(n % i == 0){
                flag = true;
                break;
            }

        }
        if(!flag) System.out.println("Enter Number is Prime " + n);
        else System.out.println("Enter Number is not Prime: " + n);

    }
}
