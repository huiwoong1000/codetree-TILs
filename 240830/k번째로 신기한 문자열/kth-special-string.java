import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] elements = sc.nextLine().split(" ");
        int count = Integer.parseInt(elements[0]);
        int index = Integer.parseInt(elements[1]);
        String startStr = elements[2];

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String str = sc.nextLine();
            if (str.startsWith(startStr)) {
                strings.add(str);
            }
        }

        strings.sort(null);
        System.out.print(strings.get(index - 1));
    }
}