import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = input.nextInt();

        if (n<=1){
            System.out.println("Neither Prime Not Composite");
            return;
        } else  {
            int c = 2;

            while(c*c<=n){
                if(n%c==0){
                    System.out.println("Not Prime");
                    return;
                }
                c++;
            }

            System.out.println("Prime Number");
            return;

        }

    }
}
