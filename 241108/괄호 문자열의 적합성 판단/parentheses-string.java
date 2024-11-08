import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> strStack = new Stack<>();
        String[] input = sc.next().split("");
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                strStack.push(input[i]);
            } else {
                if (strStack.empty() || strStack.peek().equals(")")) {
                    System.out.println("No");
                    break;
                } else {
                    strStack.pop();
                }
            }
        }

        System.out.println(strStack.empty() ? "Yes" : "No");
    }
}