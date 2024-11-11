import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> numberQueue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            numberQueue.add(i);
        }

        while (numberQueue.size() != 0) {
            for (int i = 0; i < k - 1; i++) {
                numberQueue.add(numberQueue.peek());
                numberQueue.poll();
            }
            System.out.print(numberQueue.poll() + " ");
        }
    }
}