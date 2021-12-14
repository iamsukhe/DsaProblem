public class ReverseArrat {
    public static void main(String[] args) {
        char[] s = new char[]{'h' , 'e' , 'l' , 'l' ,'o'};
        char[] charArray = new char[s.length];

        for(int i = 0; i<s.length; i++){
            charArray[i]=s[s.length-(i+1)];
        }
        System.out.println(charArray);
    }
}
