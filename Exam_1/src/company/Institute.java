package company;

import java.util.ArrayList;

public class Institute {
    private String instituteName;
    private ArrayList<Faculty> facultyList;

    public Institute(String instituteName, ArrayList<Faculty> facultyList) {
        this.instituteName = instituteName;
        this.facultyList = facultyList;
    }

    public String getШnstituteName() {
        return instituteName;
    }

    public void setШnstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }


//    //Типизированный цикл «for-each»;
//    public boolean moreCommentLikesThanVideoLikes2() {
//        for (Faculty vid : videoList) {
//            for (Students co : vid.getListOfStudents()) {
//                if (vid.getVideoLikes() < co.getNumberOfLikes()) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    //Типизированный итератор;
//    public ArrayList<String> maxVideoDislikes() {
//        ArrayList<String> maxDislikes = new ArrayList<>();
//        if (worstVideo().getVideoLikes() == 0) {
//            return new ArrayList<>();
//        }
//        long number = worstVideo().getVideoDislikes();
//        for (Iterator<Faculty> i = videoList.iterator(); i.hasNext(); ) {
//            Faculty vid = i.next();
//            if (vid.getVideoDislikes() >= number) {
//                maxDislikes.add(vid.getVideoTitle());
//                number = vid.getVideoDislikes();
//            }
//
//        }
//        return maxDislikes;
//    }
//
//    public Faculty worstVideo() {
//        Faculty worst = new Faculty();
//        for (Iterator<Faculty> i = videoList.iterator(); i.hasNext(); ) {
//            Faculty obj = i.next();
//            if (worst.getVideoDislikes() <= obj.getVideoDislikes()) {
//                worst = obj;
//            }
//        }
//        return worst;
//


    @Override
    public String toString() {
        return "Institute{" +
                "шnstituteName='" + instituteName + '\'' +
                ", facultyList=" + facultyList +
                '}';
    }
}