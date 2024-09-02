import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            members.add(new Member(sc.next(), sc.nextInt()));
        }

        members.sort(new ScoreComparator());
        System.out.println(members.get(0).getCodeName() + " " + members.get(0).getScore());
    }
}

class Member {
    private String codeName;
    private Integer score;

    public Member(String codeName, Integer score) {
        this.codeName = codeName;
        this.score = score;
    }

    public String getCodeName() {
        return codeName;
    }

    public Integer getScore() {
        return score;
    }
}

class ScoreComparator implements Comparator<Member> {

    @Override
    public int compare(Member m1, Member m2) {
        return m1.getScore().compareTo(m2.getScore());
    }
}