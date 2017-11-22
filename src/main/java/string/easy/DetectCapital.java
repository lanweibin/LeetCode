package string.easy;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        String up = word.toUpperCase();
        String low = word.toLowerCase();

        if(up.equals(word) || low.equals(word)){
            return true;
        }

        String other = word.substring(1,word.length());
        if(other.toLowerCase().equals(other)){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "UUA";

        System.out.println(detectCapitalUse(word));
    }
}
