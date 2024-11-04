import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] strArr = sc.next().split("");
        LinkedList<String> strList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            strList.addLast(strArr[i]);
        }

        ListIterator li = strList.listIterator(strArr.length);
        for (int i = 0; i < m; i++) {
            String instruction = sc.next();
            if (instruction.equals("L")) {
                if (li.hasPrevious()) {
                    li.previous();
                }
            } else if (instruction.equals("R")) {
                if (li.hasNext()) {
                    li.next();
                }
            } else if (instruction.equals("D")) {
                if (li.hasNext()) {
                    li.next();
                    li.remove();
                }
            } else if (instruction.equals("P")) {
                li.add(sc.next());
            }
        }

        for (String s : strList) {
            System.out.print(s);
        }
    }
}