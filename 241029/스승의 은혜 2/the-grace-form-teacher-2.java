import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] priceArr = new int[n];
        for (int i = 0; i < n; i++) {
            priceArr[i] = sc.nextInt();
        }

        int maxStudentNumber = 0;

        for (int i = 0; i < n; i++) {
            int[] newPriceArr = new int[n];
            System.arraycopy(priceArr, 0, newPriceArr, 0, priceArr.length);

            newPriceArr[i] /= 2;
            Arrays.sort(newPriceArr);
            
            int money = b;
            int candidate = 0;
            for (int j = 0; j < newPriceArr.length; j++) {

                if (money - newPriceArr[j] >= 0) {
                    money -= newPriceArr[j];
                    candidate = j + 1;
                } 
            }

            maxStudentNumber = Math.max(maxStudentNumber, candidate);
        }

        System.out.print(maxStudentNumber);
    }
}