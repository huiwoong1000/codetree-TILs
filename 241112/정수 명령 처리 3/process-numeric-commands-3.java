import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> numberDeque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            switch (sc.next()) {
                case "push_front" :
                    numberDeque.addFirst(sc.nextInt());
                    break;
                case "push_back" :
                    numberDeque.addLast(sc.nextInt());
                    break;
                case "pop_front" :
                    System.out.println(numberDeque.pollFirst());
                    break;
                case "pop_back" :
                    System.out.println(numberDeque.pollLast());
                    break;
                case "size" :
                    System.out.println(numberDeque.size());
                    break;
                case "empty" :
                    System.out.println(numberDeque.isEmpty() ? 1 : 0);
                    break;
                case "front" :
                    System.out.println(numberDeque.peekFirst());
                    break;
                case "back" :
                    System.out.println(numberDeque.peekLast());
                    break;
            }
        }
    }
}