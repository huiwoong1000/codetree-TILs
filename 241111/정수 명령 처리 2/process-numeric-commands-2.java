import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> numberQueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {

            String inst = sc.next();
            switch (inst) {
                case "push" :
                    numberQueue.add(sc.nextInt());
                    break;
                case "pop" :
                    System.out.println(numberQueue.poll());
                    break;
                case "size" :
                    System.out.println(numberQueue.size());
                    break;
                case "empty" :
                    System.out.println(numberQueue.isEmpty() ? 1 : 0);
                    break;
                case "front" :
                    System.out.println(numberQueue.peek());
                    break;
            }
        }
    }
}