import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        List<Integer> sumList = new ArrayList<>();

        for (int i = x; i <= y; i++) {
            List<Integer> numbers = new ArrayList<>();
            int number = i;
            while (number > 0) {
                numbers.add(number % 10);
                number /= 10;
            }

            int sum = 0;
            for (Integer n : numbers) {
                sum += n;
            }

            sumList.add(sum);
        }

        sumList.sort(null);

        System.out.print(sumList.get(sumList.size() - 1));
    }
}