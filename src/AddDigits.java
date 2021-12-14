public class AddDigits {
    public static void main(String[] args) {
        int num = 199;
        if(num==0){
            System.out.println(0);
        }

        int n1 = 0;
        while(true){
            int rem = num%10;
            n1=n1+rem;
            num = num/10;
            if(num==0){
                if(n1>=10){
                    num=n1;
                    n1=0;
                }else{
                    System.out.println(n1);
                    return;
                }
            }
        }

    }
}
