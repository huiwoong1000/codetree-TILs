import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> nList = new ArrayList<>();
        List<Integer> mList = new ArrayList<>();
        int nPosition = 0;
        int mPosition = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    nList.add(++nPosition);
                } else {
                    nList.add(--nPosition);
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    mList.add(++mPosition);
                } else {
                    mList.add(--mPosition);
                }
            }
        }

        int diffSize = Math.abs(nList.size() - mList.size());
        if (nList.size() > mList.size()) {
            for (int i = 0; i < diffSize; i++) {
                mList.add(mPosition);
            }
        } else if (nList.size() < mList.size()) {
            for (int i = 0; i < diffSize; i++) {
                nList.add(nPosition);
            }
        }
        
        int count = 0;
        for (int i = 1; i < nList.size(); i++) {
            if (nList.get(i).equals(mList.get(i))) {
                if (!nList.get(i - 1).equals(mList.get(i - 1))) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}