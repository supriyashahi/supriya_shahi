public class ToggleReverse {

    public static void main(String args[]) {
        String sample = "my name is supriya";
        String[] words = sample.split(" ");
        String result = "";
        for (String word : words) {
            StringBuffer s = new StringBuffer(word);
            word = s.reverse().toString();
            String firstSub = word.substring(0, 1);
            String secondSub = word.substring(1);
            result = result + firstSub.toLowerCase() + secondSub.toUpperCase() + " ";
        }
        System.out.println(result);

    }
}
