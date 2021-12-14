import java.util.Arrays;
public class Refrence {
    public static void main(String[] args) {

        String firstName = "John ";

        printArray(firstName);

        System.out.println(firstName);

    }

     static void printArray(String naam){
         String lastName = "Doe";
         naam = naam.concat(lastName);
         System.out.println(naam);
    }

}
