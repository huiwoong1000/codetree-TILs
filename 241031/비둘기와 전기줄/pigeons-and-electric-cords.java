import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<List<Integer>> states = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            states.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            states.get(sc.nextInt()).add(sc.nextInt());
        }

        int count = 0;
        for (int i = 0; i < states.size(); i++) {
            List<Integer> history = states.get(i);
            if (history.size() < 2) {
                continue;
            }

            for (int j = 0; j < history.size() - 1; j++) {
                if (history.get(j) != history.get(j + 1)) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}