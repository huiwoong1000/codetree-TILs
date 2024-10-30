import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        int maxCount = 0;

        for (int x = 0; x < n; x++) {
            List<Integer> elements = new ArrayList<>();
            for (int i = x; i < n; i++) {
                elements.add(numbers[i]);

                if (!(elements.get(elements.size() - 1) - elements.get(0) <= k)) {
                    break;
                }
            }

            int count = elements.size() - 1;
            maxCount = Math.max(maxCount, count);
        }


        System.out.print(maxCount);
    }
}