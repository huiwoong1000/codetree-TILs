import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private Integer koScore;
    private Integer engScore;
    private Integer mathScore;

    public Student(String name, Integer koScore, Integer engScore, Integer mathScore) {
        this.name = name;
        this.koScore = koScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public Integer getKoScore() {
        return this.koScore;
    }

    public Integer getEngScore() {
        return this.engScore;
    }

    public Integer getMathScore() {
        return this.mathScore;
    }

    @Override
    public int compareTo(Student s) {
        if (this.koScore.equals(s.getKoScore()) && this.engScore.equals(s.getEngScore())) {
            return s.getMathScore().compareTo(this.mathScore);
        } else if (this.koScore.equals(s.getKoScore())) {
            return s.getEngScore().compareTo(this.engScore);
        } else {
            return s.getKoScore().compareTo(this.koScore);
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.koScore + " " + this.engScore + " " + this.mathScore;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] studentArr = new Student[n];

        for (int i = 0; i < n; i++) {
            studentArr[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(studentArr);
        for (Student s : studentArr) {
            System.out.println(s);
        }
    }
}