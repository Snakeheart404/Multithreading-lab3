public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("name", "surname");
        Student student2 = new Student("Ivan", "Ivanov");
        Student student3 = new Student("Petro", "Petrov");
        Student[] students = new Student[] {student1, student2, student3};

        Student student4 = new Student("John", "Doe");
        Student student5 = new Student("Vasya", "Ivanov");
        Student[] students1 = new Student[] {student4, student5};

        Student student6 = new Student("Polina", "Hlazunova");
        Student student7 = new Student("ljdsv", "Ivavhdsd'voidsvnov");
        Student[] students2 = new Student[] {student6, student7};

        Group group1 = new Group(students, "IP02");
        Group group2 = new Group(students1, "IP01");
        Group group3 = new Group(students2, "IP03");

        Group[] groups = new Group[]{group1, group2, group3};

        for(Group group : groups)
        {
            for(Student student : group.getStudents())
            {
                student.setGroup(group);
            }
        }

        Journal journal = new Journal(groups);

        journal.printJournal();

        Lecturer lecturer = new Lecturer(journal);
        Assistant assistant1 = new Assistant(group1, journal);
        Assistant assistant2 = new Assistant(group2, journal);
        Assistant assistant3 = new Assistant(group3, journal);

        try {
            lecturer.addGrades(group1);
            assistant1.addGrades();
            assistant2.addGrades();
            assistant3.addGrades();
            lecturer.addGrades(group2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("===========");
        journal.printJournal();
    }
}