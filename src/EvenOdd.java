import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = input.nextInt();
        if(n%2==0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
}
