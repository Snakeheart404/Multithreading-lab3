import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Journal {

    private final Map<Student, int[]> gradesJournal = new HashMap<>();

    private Group[] groups;

    private int weeks = 4;

    public Journal(Group[] groups) {
        this.groups = groups;
        for (Group group : groups) {
            for (Student student : group.getStudents()) {
                int[] grades = new int[weeks];
                for (int j = 0; j < weeks; j++) {
                    grades[j] = 0;
                }
                gradesJournal.put(student, grades);
            }
        }
    }

    public int getWeeks() {
        return weeks;
    }
    public void addGrade(Student student, int week, int grade) {
        synchronized (gradesJournal.get(student)) {
            if (grade < 0 || grade > 100) throw new RuntimeException("Error! Grades can be lower than 0 or greater than 100!");
            gradesJournal.get(student)[week] = grade;
        }
    }

    public void printJournal()
    {
        for (Group group : groups) {
            System.out.println("- JOURNAL " + group.getGroupName() + " -");
            for (Student student : gradesJournal.keySet()) {
                if(student.getGroup().getGroupName() == group.getGroupName())
                {
                    System.out.print(student.getSurname() + " " + student.getName() + " - ");
                    for (int j = 0; j < weeks; j++) {
                        System.out.print(gradesJournal.get(student)[j] + " ");
                    }
                    System.out.println();
                }
            }
        }


    }



}
