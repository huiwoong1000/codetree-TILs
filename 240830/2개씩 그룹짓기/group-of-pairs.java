import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] strNumbers = sc.nextLine().split(" ");

        Integer[] numbers = new Integer[n * 2];
        for (int i = 0; i < n * 2; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        Arrays.sort(numbers);

        Integer[] sumOfPairs = getSumOfPairs(numbers, n);
        Arrays.sort(sumOfPairs, Collections.reverseOrder());

        System.out.print(sumOfPairs[0]);
    }

    private static Integer[] getSumOfPairs(Integer[] numbers, int countOfPairs) {
        Integer[] sumOfPairs = new Integer[countOfPairs];
        for (int i = 0; i < countOfPairs; i++) {
            sumOfPairs[i] = numbers[i] + numbers[numbers.length - i - 1];
        }

        return sumOfPairs;
    }
}