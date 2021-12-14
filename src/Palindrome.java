import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Palindrome String: ");

        String s1 = input.nextLine();

        int flag = 0;


        for (int i = 0 ; i<s1.length() ; i++){
            if( !(s1.charAt(i) == s1.charAt(s1.length()-(i+1))) ){
                flag = 0;
                System.out.println("String is Not Palindrome");
                return;
            }else {
                flag = 1;
            }
        }


        if (flag == 1){
            System.out.println("String is Palindrome");
        }

    }
}
