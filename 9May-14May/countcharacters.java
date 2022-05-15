package MayAssignment.week2.May11;

public class countcharacters {
    private static void countChar(String str) {
        int special =0, digit =0, alpha =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
                digit++;
            if(Character.isLetter(ch))
                alpha++;
            if(!Character.isLetterOrDigit(ch))
                special++;
        }
        System.out.println("Digits: "+digit);
        System.out.println("Alphabets: "+ alpha);
        System.out.println("Special: "+special);
    }
    public static void main(String[] args) {
        String str = "12as%#uv#Kl$";
        countChar(str);
    }
}
