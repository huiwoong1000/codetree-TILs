import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int count = 0;
        for (int i = x; i <= y; i++) {
            String[] numStrArr = String.valueOf(i).split("");
            int[] sameDigitCount = new int[10];
            
            for (int j = 0; j < numStrArr.length; j++) {
                sameDigitCount[Integer.valueOf(numStrArr[j])]++;
            }

            boolean isMagicNum = false;
            for (int j = 0; j < sameDigitCount.length; j++) {
                if (sameDigitCount[j] == numStrArr.length - 1) {
                    isMagicNum = true;
                }
            }

            if (isMagicNum) {
                count++;
            }
        }

        System.out.print(count);
    }
}