import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String subStr = sc.nextLine();
        
        System.out.print(strIndexOf(str, subStr));
    }

    private static int strIndexOf(String str, String subStr) {
        return str.indexOf(subStr);
    }
}