import java.util.*;

class Bomb {
    private String code;
    private String color;
    private int second;

    public Bomb(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }

    public void printInfo() {
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + second);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        Bomb bomb = new Bomb(input[0], input[1], Integer.parseInt(input[2]));
        bomb.printInfo();
    }
}