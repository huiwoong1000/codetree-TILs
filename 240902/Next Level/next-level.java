import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();

        Member member1 = new Member("codetree", 10);
        Member member2 = new Member(id, level);

        member1.printInfo();
        member2.printInfo();
    }
}

class Member {
    private String id;
    private int level;

    public Member(String id, int level) {
        this.id = id;
        this.level = level;   
    }

    public void printInfo() {
        System.out.println("user " + id + " lv " + level);
    }
}