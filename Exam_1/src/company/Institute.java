package company;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String instituteName;
    private ArrayList<Faculty> facultyList;

    public Institute(String instituteName, ArrayList<Faculty> facultyList) {
        this.instituteName = instituteName;
        this.facultyList = facultyList;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public Faculty getTheMostPopularFaculty() {
        int counter = 0;
        Faculty theMostPopularFaculty = null;
        for (Faculty facultyList : this.getFacultyList()) {
            if (facultyList.getListOfStudents().size() > counter) {
                counter = facultyList.getListOfStudents().size();
                theMostPopularFaculty = facultyList;
            }
        }
        return theMostPopularFaculty;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "instituteName='" + instituteName + '\'' +
                ", facultyList=" + facultyList +
                '}';
    }
}