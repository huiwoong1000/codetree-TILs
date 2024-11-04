import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] inputStr = sc.nextLine().split(" ");
            String instruction = inputStr[0];
            if (instruction.equals("push_front")) {
                numbers.addFirst(Integer.valueOf(inputStr[1]));
            } else if (instruction.equals("push_back")) {
                numbers.addLast(Integer.valueOf(inputStr[1]));
            } else if (instruction.equals("pop_front")) {
                System.out.println(numbers.pollFirst());
            } else if (instruction.equals("pop_back")) {
                System.out.println(numbers.pollLast());
            } else if (instruction.equals("size")) {
                System.out.println(numbers.size());
            } else if (instruction.equals("empty")) {
                System.out.println(numbers.isEmpty() ? 1 : 0);
            } else if (instruction.equals("front")) {
                System.out.println(numbers.peekFirst());
            } else if (instruction.equals("back")) {
                System.out.println(numbers.peekLast());
            } else {
                System.out.println("The instruction is not valid");
            }
        }
    }
}