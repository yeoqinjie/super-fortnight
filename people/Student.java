package people;

public class Student extends Person {
    private int studentNumber;

    public Student(String name, int studentNumber) {
        super(name);
        setStudentNumber(studentNumber);
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String toString() {
        return super.toString() + "\nStudent Number: " + getStudentNumber();
    }
}
