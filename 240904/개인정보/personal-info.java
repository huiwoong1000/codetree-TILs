import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Member[] members = new Member[5];
        for (int i = 0; i < 5; i++) {
            members[i] = new Member(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        System.out.println("name");
        Arrays.sort(members, new NameComparator());
        for (Member m : members) {
            System.out.println(m);
        }
        System.out.println();
        
        System.out.println("height");
        Arrays.sort(members, new HeightComparator().reversed());
        for (Member m : members) {
            System.out.println(m);
        }
    }
}

class Member {

    private String name;
    private Integer h;
    private Double w;

    public Member(String name, Integer h, Double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public Integer getH() {
        return h;
    }

    @Override
    public String toString() {
        return name +  " " + h + " " + w;
    }
}

class NameComparator implements Comparator<Member> {

    @Override
    public int compare(Member m1, Member m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

class HeightComparator implements Comparator<Member> {

    @Override
    public int compare(Member m1, Member m2) {
        return m1.getH().compareTo(m2.getH());
    }
}