import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number 1: ");
        int n1 = input.nextInt();
        System.out.print("Enter a Number 2: ");
        int n2 = input.nextInt();

        System.out.print("Enter a operator +, -, *, / : ");
        String op  = input.next();

        if (op.equals("+")){
            System.out.println("Sum is " + (n1+n2));
        }else if(op.equals("-")){
            System.out.println("Substraction is " + (n1-n2));
        }else if(op.equals("*")){
            System.out.println("Multiplication is " + (n1*n2));
        }else {
            System.out.println("Division is " + (n1/n2));
        }

    }
}
