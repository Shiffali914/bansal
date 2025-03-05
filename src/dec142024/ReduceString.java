package dec142024;

public class ReduceString {

    public static void main(String[] args) {
        String input="ABTE";
        System.out.println(" length of string is: "+removePair(input));
    }

    public static int removePair(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replace("AB","").replace("CD","");
        }
        return s.length();
    }
}