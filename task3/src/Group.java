public class Group {
    private Student[] students;
    private String name;

    public Group(Student[] students, String name) {
        this.students = students;
        this.name = name;
    }
    public Student[] getStudents() {
        return students;
    }

    public String getGroupName() {
        return name;
    }
}