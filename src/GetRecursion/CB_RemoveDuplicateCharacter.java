package GetRecursion;

public class CB_RemoveDuplicateCharacter {
    public static void main(String[] args) {
        System.out.println(removeDuplicateChar("hellolll"));
    }

    public static String removeDuplicateChar(String str) {

        if(str.length()<=1){
            return str;
        }

        if (str.substring(0, 1).equals(str.substring(1, 2))) {
            String ros = removeDuplicateChar(str.substring(1));
            return str.charAt(0)+ros.substring(1);
        } else {
            String ros = removeDuplicateChar(str.substring(1));
            return str.charAt(0)+ros;
        }
    }
}
