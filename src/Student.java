// A Student with a name and an id.
public class Student {
    String id;
    String name;

    // Create a Student named name with UTORid ID.
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Returns true iff other is a Student and has an identical id to this student.
    public boolean equals(Object other) {
        if (other instanceof Student) {
            Student otherStudent = (Student) other;
            return this.id == otherStudent.id;
        }
        return false;
    }
}
