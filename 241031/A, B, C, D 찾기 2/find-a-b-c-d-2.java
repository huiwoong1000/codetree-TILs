import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 15;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        int a = numbers[0];
        int b = numbers[1];
        int c = (a + b != numbers[2]) ? numbers[2] : numbers[3];
        int d = numbers[numbers.length - 1] - a - b - c;

        System.out.print(a + " " + b + " " + c + " " + d);
    }
}