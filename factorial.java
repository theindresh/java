public class factorial {
    public static int fact(int n){
        int fa = 1;
        for(int i= 1; i<= n; i++){
            fa = fa*i;
        }
        return fa;
    }
    public static int bincoeff(int n, int r){
        int a = fact(n);
        int b = fact(r);
        int c = fact(n-r);
        int bc = a/(b*c);
        return bc;
    }
    public static void main(String[] args) {
        System.out.println(bincoeff(5,2));

    }
}
