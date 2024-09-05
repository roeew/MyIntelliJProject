public class Student {
    private String name;
    private OnGradeUpdateListener listener;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setListener(OnGradeUpdateListener listener) {
        this.listener = listener;
    }

    public void graded(int grade) {
        this.listener.onGradeUpdate(grade);
    }
}