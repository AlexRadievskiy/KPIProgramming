package com.company;

import java.util.*;

public class Videoblog {
    private VideoByTitleAndUrlComparator videoByTitleAndUrlComparator = new VideoByTitleAndUrlComparator();
    private String videoblogger;
    private Set<Video> videoSet = new TreeSet<>(videoByTitleAndUrlComparator);


    public Videoblog(String videoblogger, Set<Video> videoSet) {
        this.videoblogger = videoblogger;
        this.videoSet.addAll(videoSet);
    }

    public String getVideoblogger() {
        return videoblogger;
    }

    public Set<Video> getVideoSet() {
        return videoSet;
    }

    //Не типизированный итератор;
    public long allVideos() {
        long videoSum = 0;
        for (Video video : videoSet) {
            videoSum += video.getViews();
        }
        return videoSum;
    }
    //Типизированный цикл «for-each»;
    public boolean moreCommentLikesThanVideoLikes() {
        for (Iterator i = videoSet.iterator(); i.hasNext();) {
            Video vid = (Video) i.next();
            if (vid.getVideoLikes() < vid.getMaxCommentLikes()) {
                return true;
            }
        }
        return false;
    }
    //Типизированный итератор;
    public TreeSet<Video> maxVideoDislikes() {
        TreeSet<Video> vi = new TreeSet<>(videoByTitleAndUrlComparator);
        long number = worstVideo().getVideoDislikes();
        for (Iterator<Video> i = videoSet.iterator(); i.hasNext(); ) {
            Video vid = i.next();
            if (vid.getVideoDislikes() == number && vid.getVideoDislikes() != 0) {
                vi.add(vid);
                number = vid.getVideoDislikes();
            }
        }
        return vi;
    }

    public Video worstVideo() {
        Video worst = new Video();
        for (Iterator<Video> i = videoSet.iterator(); i.hasNext(); ) {
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
                ", videoSet=" + videoSet;
    }
}