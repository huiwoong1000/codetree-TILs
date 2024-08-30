import  java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] chrArr = sc.nextLine().toCharArray();

        Arrays.sort(chrArr);
        String result = new String(chrArr);

        System.out.print(result);
    }
}