import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] instruction = sc.nextLine().split(" ");

            if (instruction[0].equals("push_back")) {
                numbers.add(Integer.valueOf(instruction[1]));
            } else if (instruction[0].equals("get")) {
                System.out.println(numbers.get(Integer.valueOf(instruction[1]) - 1));
            } else if (instruction[0].equals("size")) {
                System.out.println(numbers.size());
            } else if (instruction[0].equals("pop_back")) {
                numbers.remove(numbers.size() - 1);
            }
        }
    }
}