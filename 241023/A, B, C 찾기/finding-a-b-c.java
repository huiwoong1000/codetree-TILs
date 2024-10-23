import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];

        for (int i = 0; i < 7; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print(numbers[0] + " " + numbers[1] + " " + (numbers[6] - numbers[0] - numbers[1]));
    }
}