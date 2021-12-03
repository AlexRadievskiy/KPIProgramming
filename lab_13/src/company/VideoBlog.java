package company;

import java.util.ArrayList;
import java.util.Iterator;

public class VideoBlog {
    private String videoblogger;
    private ArrayList<Video> videoList;

    public VideoBlog(String videoblogger, ArrayList<Video> videoList) {
        this.videoblogger = videoblogger;
        this.videoList = videoList;
    }

    public VideoBlog() {
        this.videoblogger = "";
        this.videoList = new ArrayList<>();
    }

    public String getVideoBlogger() {
        return videoblogger;
    }

    public void setVideoBlogger(String videoblogger) {

        this.videoblogger = videoblogger;
    }

    public ArrayList<Video> getVideoList() {
        return videoList;
    }

    public void setVideoList(ArrayList<Video> videoList) {

        this.videoList = videoList;
    }

    //Не типизированный итератор;
    public long allVideos() {
        long videoSum = 0;
        for (Iterator i = videoList.iterator(); i.hasNext(); ) {
            Object o = i.next();
            if (o instanceof Video)
                videoSum += ((Video) o).getViews();
        }
        return videoSum;
    }
    //Типизированный цикл «for-each»;
    public boolean moreCommentLikesThanVideoLikes2() {
        for (Video vid : videoList) {
            for (Comments co : vid.getListOfComments()) {
                if (vid.getVideoLikes() < co.getNumberOfLikes()) {
                    return true;
                }
            }
        }
        return false;
    }

    //Типизированный итератор;
    public ArrayList<String> maxVideoDislikes() {
        ArrayList<String> maxDislikes = new ArrayList<>();
        if (worstVideo().getVideoLikes() == 0) {
            return new ArrayList<>();
        }
        long number = worstVideo().getVideoDislikes();
        for (Iterator<Video> i = videoList.iterator(); i.hasNext(); ) {
            Video vid = i.next();
            if (vid.getVideoDislikes() >= number) {
                maxDislikes.add(vid.getVideoTitle());
                number = vid.getVideoDislikes();
            }

        }
        return maxDislikes;
    }

    public Video worstVideo() {
        Video worst = new Video();
        for (Iterator<Video> i = videoList.iterator(); i.hasNext(); ) {
            Video obj = i.next();
            if (worst.getVideoDislikes() <= obj.getVideoDislikes()) {
                worst = obj;
            }
        }
        return worst;
    }

    @Override
    public String toString() {
        return "Videoblog: " +
                "videoblogger='" + videoblogger + '\'' +
                ", videoList=" + videoList;
    }
}