import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Member[] members = new Member[n];
        for (int i = 0; i < n; i++) {
            members[i] = new Member(sc.next(), sc.next(), sc.next());
        }

        Member lastMember = members[n - 1];
        System.out.println("name " + lastMember.getName());
        System.out.println("addr " + lastMember.getZipcode());
        System.out.println("city " + lastMember.getRegion());
    }
}

class Member implements Comparable<Member> {
    
    private String name;
    private String zipcode;
    private String region;

    public Member(String name, String zipcode, String region) {
        this.name = name;
        this.zipcode = zipcode;
        this.region = region;
    }

    public String getName() {
        return this.name;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public String getRegion() {
        return this.region;
    }

    @Override
    public int compareTo(Member m) {
        return this.name.compareTo(m.getName());
    }
}