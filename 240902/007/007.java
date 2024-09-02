import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] code = sc.nextLine().split(" ");

        Secret secret1 = new Secret(code[0], code[1], Integer.parseInt(code[2]));
        secret1.printInfo();
    }
}

class Secret {
    private String secretCode;
    private String meetingPoint;
    private int time;

    public Secret(String secretCode, String meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public void printInfo() {
        System.out.println("secret code : " + secretCode);
        System.out.println("meeting point : " + meetingPoint);
        System.out.println("time : " + time);
    }
}