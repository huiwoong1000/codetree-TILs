import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] strNumbers = sc.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(strNumbers[i]));

            if (numbers.size() % 2 == 1) {
                numbers.sort(null);
                System.out.print(numbers.get(i / 2) + " ");
            }
        }
    }
}