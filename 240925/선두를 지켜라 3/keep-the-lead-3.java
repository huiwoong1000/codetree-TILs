import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> nList = new ArrayList<>();
        nList.add(0);
        List<Integer> mList = new ArrayList<>();
        mList.add(0);
        int position = 0;

        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                position += v;
                nList.add(position);
            }
        }

        position = 0;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                position += v;
                mList.add(position);
            }
        }

        int count = 0;
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < nList.size(); i++) {
            if (nList.get(i) > mList.get(i)) {
                leaders.add(1); //n
            } else if (nList.get(i) < mList.get(i)) {
                leaders.add(2); //m
            } else {
                leaders.add(0); //n, m
            }
        }

        for (int i = 1; i < leaders.size(); i++) {
            if (leaders.get(i - 1) != leaders.get(i)) {
                count++;
            }
        }

        System.out.print(count);
    }
}