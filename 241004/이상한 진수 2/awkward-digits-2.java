import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] charDigits = sc.next().toCharArray();
        if (charDigits.length == 1) {
            System.out.print(0);
            return;
        }
        
        List<Integer> digits = new ArrayList<>();

        for (int i = 0; i < charDigits.length; i++) {
            digits.add(charDigits[i] - '0');
        }

        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i < digits.size(); i++) {

            int candidateNumber = 0;
            for (int j = 0; j < digits.size(); j++) {
                if (i == j) {
                    candidateNumber = candidateNumber * 2 + (digits.get(i) == 1 ? 0 : 1);
                } else {
                    candidateNumber = candidateNumber * 2 + digits.get(j);
                }
            }
            maxNum = Math.max(maxNum, candidateNumber);
        }

        System.out.print(maxNum);
    }
}