public class Fibonacci {
    public static void main(String[] args) {
        int n = 8 ;
        int a = 0 ;
        int b = 1 ;
        int count = 0;

        for (int i = 1; i<=n ; i++){
            System.out.println(a);
            int temp = b;
            b = b+a;
            a = temp;
        }

    }
}
