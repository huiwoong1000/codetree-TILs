import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) { //하나를 선택해 2배
            numbers[i] *= 2;

            List<Integer> numberList = new ArrayList<>();
            for (int j = 0; j < n; j++) { //하나를 제거
                for (int k = 0; k < n; k++) {
                    if (j == k) {
                        continue;
                    }
                    numberList.add(numbers[k]);
                }
                
                //인접한 숫자간의 차의 합이 최소가 되도록
                int sum = 0;
                for (int k = 0; k < numberList.size() - 1; k++) {
                    sum += Math.abs(numberList.get(k) - numberList.get(k + 1));
                }

                minSum = Math.min(minSum, sum);
            }

            numbers[i] /= 2;
        }

        System.out.print(minSum);
    }
}