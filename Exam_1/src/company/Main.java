package company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Students firstStudent = new Students("Alex", "Surname", 5, 54.3);
        Students secondStudent = new Students("Masha", "Surname", 3, 44.5);
        Students thirdStudent = new Students("Dima", "Surname", 7, 12);
        ArrayList<Students> fictStudents = new ArrayList<>();
        ArrayList<Students> otherFacStudents = new ArrayList<>();
        fictStudents.add(firstStudent);
        fictStudents.add(secondStudent);
        otherFacStudents.add(thirdStudent);

        Faculty fict = new Faculty("FICT", fictStudents);
        Faculty otherFaculty = new Faculty("Other faculty", otherFacStudents);

        ArrayList<Faculty> facultyList = new ArrayList<>();
        facultyList.add(fict);
        facultyList.add(otherFaculty);

        Institute kpi = new Institute("KPI", facultyList);

        //ВЫВОД
        System.out.println(kpi.getTheMostPopularFaculty());

    }
}