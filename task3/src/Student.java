public class Student {
    private String name;
    private String surname;

    private Group group;


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void setGroup (Group group)
    {
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }
}