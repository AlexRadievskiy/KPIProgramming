package company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Students firstStudent = new Students("Alex", "Surname", 5, 54.3);
        Students secondStudent = new Students("Masha", "Surname", 3, 44.5);
        ArrayList<Students> StudentsList = new ArrayList<>();
        StudentsList.add(firstStudent);
        StudentsList.add(secondStudent);
        Faculty FICT = new Faculty("FICT", StudentsList);

        ArrayList<Faculty> facultyList = new ArrayList<>();
        facultyList.add(FICT);

        Institute KPI = new Institute("KPI", facultyList);

        //ВЫВОД
//        System.out.println(size); //Общее количество просмотров

    }
}