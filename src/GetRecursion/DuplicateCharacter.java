package GetRecursion;

public class DuplicateCharacter {
    public static void main(String[] args) {
        System.out.println(insertDuplicateCharStar("hello"));
    }

    public static String insertDuplicateCharStar(String str){
        if (str.length() <= 1){
            return str;
        }

        if (str.substring(0,1).equals(str.substring(1,2))){
            String ros = insertDuplicateCharStar(str.substring(1));
            return str.charAt(0)+"*"+ros;
        } else {
            String ros = insertDuplicateCharStar(str.substring(1));
            return str.charAt(0)+ros;
        }

    }

}
