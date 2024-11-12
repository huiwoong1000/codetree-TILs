import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> numberDeque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            numberDeque.addLast(i);
        }

        while (numberDeque.size() != 1) {
            numberDeque.pollFirst();
            numberDeque.addLast(numberDeque.pollFirst());
        }

        System.out.print(numberDeque.pollFirst());
    }
}