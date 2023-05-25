public class Lecturer {
    private Journal journal;

    public Lecturer (Journal journal) {
        this.journal = journal;
    }

    public void addGrades(Group group) throws InterruptedException {
        AddGradesThread thread = new AddGradesThread(journal, group);

        thread.start();
        thread.join();
    }
}
