import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            // result = result * 2 + Integer.parseInt(String.valueOf(str.charAt(i)));
            result = result * 2 + (str.charAt(i) - '0');
        }

        System.out.print(result);
    }
}