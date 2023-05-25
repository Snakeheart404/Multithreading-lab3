public class Assistant {
    private Group group;

    private Journal journal;

    public Assistant (Group group, Journal journal) {
        this.group = group;
        this.journal = journal;
    }

    public void addGrades() throws InterruptedException {
        AddGradesThread thread = new AddGradesThread(journal, group);

        thread.start();
        thread.join();
    }
}
