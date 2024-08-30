import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] strNumbers1 = sc.nextLine().split(" ");
        String[] strNumbers2 = sc.nextLine().split(" ");

        Integer[] numbers1 = new Integer[n];
        Integer[] numbers2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            numbers1[i] = Integer.parseInt(strNumbers1[i]);
            numbers2[i] = Integer.parseInt(strNumbers2[i]);
        }

        Arrays.sort(numbers1);
        Arrays.sort(numbers2);

        System.out.print((Arrays.toString(numbers1).equals(Arrays.toString(numbers2))) ? "Yes" : "No");
    }
}