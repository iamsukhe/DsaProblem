import java.util.Scanner;

public class ArmstrongNumber {

    static int  count_digits(int n)
    {
        String num = Integer.toString(n);
        return  +num.length();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println(153%10); ----- 10*15 = 150 , Rem = 3
//        System.out.println(153/10); ----- 15

        System.out.print("Enter a Armstrong Number: ");

        int n1 = input.nextInt();
        int count = count_digits(n1);
        int divideNumber = n1;
        double sum = 0;

        while (divideNumber>0){
            int rem = divideNumber%10;
            sum = sum + Math.pow(rem, count);

            divideNumber = divideNumber/10;
        }

        int value = (int)(sum);

        if(n1==value){
            System.out.println("Number is Armstrong");
        }else {
            System.out.println("Number is not Armstrong");
        }

    }
}
