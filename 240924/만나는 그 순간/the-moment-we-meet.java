import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> NList = new ArrayList<>();
        List<Integer> MList = new ArrayList<>();
        int position = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    NList.add(++position);
                } else {
                    NList.add(--position);
                }
            }
        }

        position = 0;
        index = 0;

        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    MList.add(++position);
                } else {
                    MList.add(--position);
                }
            }
        }

        int result = -1;
        for (int i = 1; i < NList.size(); i++) {
            
            if (NList.get(i).equals(MList.get(i))) {
                result = i + 1;
                break;
            }
        }

        System.out.print(result);
    }
}