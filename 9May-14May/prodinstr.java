package MayAssignment.week2.May11;

class prodinstr {
    private static int findProduct(String str) {
        
        int prod=1;
        for(int i = 0; i<str.length(); i++){
            
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int index = Integer.parseInt(ch+"");
                prod *= index;

            }
        }
        return prod;
    }
    public static void main(String[] args) {
        String str = "as13r52e1u2";
        System.out.println(findProduct(str));
    }
}
