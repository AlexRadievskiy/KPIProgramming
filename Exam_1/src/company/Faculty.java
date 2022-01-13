package company;

import java.util.ArrayList;

public class Faculty {
    private String facultyName;
    private ArrayList<Students> listOfStudents;

    public Faculty(String facultyName, ArrayList<Students> listOfStudents) {
        this.facultyName = facultyName;
        this.listOfStudents = listOfStudents;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public ArrayList<Students> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Students> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", listOfStudents=" + listOfStudents +
                '}';
    }
}