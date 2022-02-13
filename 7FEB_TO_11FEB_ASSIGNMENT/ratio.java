package FebEight;

import java.util.Scanner;

public class ratio {
    public static String vowToCon(String str) {
        String ratio="";
        int n= str.length();
        int vowel=0, consonant=0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||
            str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u' || str.charAt(i) == 'U'){
                vowel++;
            }else if(str.charAt(i)==' '){
                
            }else{
                consonant++;
            }
        }
        ratio = Integer.toString(vowel)+":"+Integer.toString(consonant);
        return ratio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = vowToCon(str);
        System.out.println(result);
        
        sc.close();
    }
}
