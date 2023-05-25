import java.util.Random;

public class AddGradesThread extends Thread {
    private final Journal journal;
    private final Group group;

    public AddGradesThread(Journal journal, Group group) {
        this.journal = journal;
        this.group = group;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (Student student : group.getStudents()) {
            for (int i = 0; i < journal.getWeeks(); i++) {
                journal.addGrade(student, i, random.nextInt(100));
            }
        }

    }
}