package MayAssignment.week2.May11;

public class remSpecialUpper {
    private static String removeSpecialUpper(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isUpperCase(ch) && Character.isLetterOrDigit(ch))
                s+=ch;
        }


        return s;
    }
    public static void main(String[] args) {
        String str = "Aste6%e#12(loP";
        System.out.println(removeSpecialUpper(str));
    }
}
