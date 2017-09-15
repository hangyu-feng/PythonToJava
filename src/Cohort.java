// A Cohort is a list of Students.
public class Cohort {

    public static void main(String[] args) {
        Cohort c = new Cohort(2017);
        Student s1 = new Student("utor", "s");
        Student s2 = new Student("utor", "s");
        c.add(s1);
        System.out.println(c);
        System.out.println(c.contains(s1));
        System.out.println(c.contains(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    int year;
    Student[] students;
    int num;

    // Initialize a Cohort of Students for a year.
    private Cohort(int year) {
        this.year = year;
        this.students = new Student[100];
        this.num = 0;
    }

    // Adds the student to the Cohort.
    private void add(Student student) {
        this.students[num] = student;
        this.num += 1;
    }

    // Returns true if student is this Cohort.
    public boolean contains(Student student) {
        for (int i = 0; i < num; i++) {
            if (student.equals(students[i])) {
                return true;
            }
        }
        return false;
    }
}
