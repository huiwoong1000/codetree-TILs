import java.util.*;

class Member implements Comparable<Member> {

    private String name;
    private Integer height;
    private Integer weight;

    public Member(String name, Integer height, Integer weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Integer getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.name + " " + this.height + " " + this.weight;
    }

    @Override
    public int compareTo(Member m) {
        return this.height.compareTo(m.getHeight());
    }
}
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