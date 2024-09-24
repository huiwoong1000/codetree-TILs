import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> listA = new ArrayList<>();
        listA.add(0);
        List<Integer> listB = new ArrayList<>();
        listB.add(0);

        int position = 0;
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                position += v;
                listA.add(position);
            }
        }

        position = 0;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                position += v;
                listB.add(position);
            }
        }

        int count = 0;
        int curr = 0;
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            diff.add(listA.get(i) - listB.get(i));

            if (diff.get(i) < 0) {
                if (curr > 0) {
                    count++;
                }
            } else if (diff.get(i) > 0) {
                if (curr < 0) {
                    count++;
                }
            }

            if (diff.get(i) != 0) {
                curr = diff.get(i);
            }
        }

        System.out.print(count);
    }
}