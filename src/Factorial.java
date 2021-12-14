import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
        int fact = 1;
        if(n==0){
            System.out.println(1);
            return;
        }
        while(n>0){
            fact = fact * n;
            n = n-1;
        }

        System.out.println(fact);
    }
}
