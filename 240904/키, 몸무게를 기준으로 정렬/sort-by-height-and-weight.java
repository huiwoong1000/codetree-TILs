import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            members[i] = new Member(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(members);
        for (Member m : members) {
            System.out.println(m);
        }
    }
}

class Member implements Comparable<Member> {
    
    private String name;
    private Integer h;
    private Integer w;

    public Member(String name, Integer h, Integer w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    public Integer getH() {
        return h;
    }

    public Integer getW() {
        return w;
    }

    @Override
    public int compareTo(Member m) {
        if (this.h.equals(m.getH())) {
            return m.getW().compareTo(this.w);
        } else {
            return this.h.compareTo(m.getH());
        }
    }

    @Override
    public String toString() {
        return name + " " + h + " " + w;
    }
}