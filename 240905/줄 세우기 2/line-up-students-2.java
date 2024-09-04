import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {

    private Integer h;
    private Integer w;
    private Integer number;
    private static Integer sequence = 0;

    public Student(Integer h, Integer w) {
        this.h = h;
        this.w = w;
        this.number = ++sequence;
    }

    public Integer getH() {
        return h;
    }

    public Integer getW() {
        return w;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public int compareTo(Student s) {
         if (h.equals(s.getH())) {
            return s.getW().compareTo(w);
        } else {
            return h.compareTo(s.getH());
        }
    }

    @Override
    public String toString() {
        return h + " " + w + " " + number;
    }
}