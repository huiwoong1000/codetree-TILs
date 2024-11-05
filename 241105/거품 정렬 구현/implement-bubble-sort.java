import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isSorted = false;
                }
            }
        } while (!isSorted);

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}