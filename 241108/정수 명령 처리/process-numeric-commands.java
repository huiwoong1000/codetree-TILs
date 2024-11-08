import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> numberStack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String instruction = sc.next();

            switch (instruction) {
                case "push" :
                    numberStack.push(sc.nextInt());
                    break;
                case "size" :
                    System.out.println(numberStack.size());
                    break;
                case "pop" :
                    System.out.println(numberStack.pop());
                    break;
                case "empty" :
                    System.out.println(numberStack.empty() ? 1 : 0);
                    break;
                case "top" :
                    System.out.println(numberStack.peek());
                    break;
            }
        }
    }
}