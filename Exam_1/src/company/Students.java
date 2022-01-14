package company;

public class Students {
    private String studentName;
    private String studentSurname;
    private int studentNumber;
    private double value;

    public Students(String studentName, String studentSurname, int studentNumber, double value) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentNumber = studentNumber;
        this.value = value;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentNumber=" + studentNumber +
                ", value=" + value +
                '}';
    }
}
