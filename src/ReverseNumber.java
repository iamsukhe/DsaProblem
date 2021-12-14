public class ReverseNumber {
    public static void main(String[] args) {
        int n = 458792;
        int r = 0;
        while( n > 0){
            int rem = n%10;
            r=(r*10)+rem;
            n=n/10;
        }

        System.out.println(r);
    }
}
