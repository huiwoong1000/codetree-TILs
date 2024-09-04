import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] members = new Student[n];
        for (int i = 0; i < n; i++) {
            members[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(members);
        for (Student s : members) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {

    private String name;
    private Integer score1;
    private Integer score2;
    private Integer score3;
    private Integer totalScore;

    public Student(String name, Integer score1, Integer score2, Integer score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.totalScore = score1 + score2 + score3;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student s) {
        return this.getTotalScore().compareTo(s.getTotalScore());
    }

    @Override
    public String toString() {
        return name + " " + score1 + " " + score2 + " " + score3;
    }
}