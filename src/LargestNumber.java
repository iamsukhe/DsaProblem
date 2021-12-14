import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number 1: ");
        int n1 = input.nextInt();
        System.out.print("Enter a Number 2: ");
        int n2 = input.nextInt();

        if(n1>n2){
            System.out.println("Number 1 is greater");
        }else {
            System.out.println("Number 2 is greater");
        }

    }
}
