package com.company;

import java.util.*;

public class Video{
    private String videoTitle;
    private String url;
    private int views;
    private int videoLikes;
    private int videoDislikes;
    private Set<Comments> setOfComments = new TreeSet<>();

    public Video(String videoTitle, String url, int views, int videoLikes, int videoDislikes, Set<Comments> SetOfComments) {
        this.videoTitle = videoTitle;
        this.url = url;
        this.views = views;
        this.videoLikes = videoLikes;
        this.videoDislikes = videoDislikes;
        this.setOfComments.addAll(SetOfComments);
    }

    public Video() {
        this.videoTitle = "";
        this.url = "";
        this.views = 0;
        this.videoLikes = 0;
        this.videoDislikes = 0;
        setOfComments = new TreeSet<>();
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getUrl() {
        return url;
    }

    public int getViews() {
        return views;
    }

    public int getVideoLikes() {
        return videoLikes;
    }

    public int getVideoDislikes() {
        return videoDislikes;
    }

    public Set<Comments> getSetOfComments() {
        return setOfComments;
    }

    public int getMaxCommentLikes(){
        int res = 0;
        for (Iterator j = getSetOfComments().iterator(); j.hasNext();){
            Comments co = (Comments) j.next();
            if (co.getaNumberOfLikes() > res){
                res = co.getaNumberOfLikes();
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Video: " +
                "videoTitle='" + videoTitle + '\'' +
                ", url='" + url + '\'' +
                ", views=" + views +
                ", videoLikes=" + videoLikes +
                ", videoDislikes=" + videoDislikes +
                ", SetOfComments=" + setOfComments;
    }
}
