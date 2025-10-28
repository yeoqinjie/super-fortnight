package people;

public class Graduate extends Student {
    private String course;

    public Graduate(String name, int studentNumber, String course) {
        super(name, studentNumber);
        setCourse(course);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString() {
        return "Graduate---\n" + super.toString() + "\nCourse: " + getCourse();
    }
}
