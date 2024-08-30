import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] strNumbers = sc.nextLine().split(" ");
        Integer[] numbers = new Integer[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        Arrays.sort(numbers);
        printResult(numbers);
        System.out.println();
        
        Arrays.sort(numbers, Collections.reverseOrder());
        printResult(numbers);
    }

    private static void printResult(Integer[] numbers) {

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}