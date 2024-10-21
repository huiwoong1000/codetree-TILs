import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                }
                double avg = (double) sum / (j - i + 1);
                
                for (int k = i; k <= j; k++) {
                    if (numbers[k] == avg) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.print(count);
    }
}