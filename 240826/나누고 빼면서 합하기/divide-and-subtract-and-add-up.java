import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int num = sc.nextInt();
        String temp = sc.nextLine();
        String str = sc.nextLine();

        System.out.print(resolve(length, num, str));
    }

    private static int resolve(int length, int num, String str) {
        String[] strings = str.split(" ");
        int sum = 0;
        sum += Integer.parseInt(strings[num - 1]);

        while(num > 1) {
            if (num % 2 == 1) {
                num--;
                sum += Integer.parseInt(strings[num - 1]);
            } else {
                num = num / 2;
                sum += Integer.parseInt(strings[num - 1]);
            }
        }

        return sum;
    }
}