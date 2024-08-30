import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] chrArr1 = sc.nextLine().toCharArray();
        char[] chrArr2 = sc.nextLine().toCharArray();

        Arrays.sort(chrArr1);
        Arrays.sort(chrArr2);

        System.out.print(Arrays.toString(chrArr1).equals(Arrays.toString(chrArr2)) ? "Yes" : "NO");
    }
}