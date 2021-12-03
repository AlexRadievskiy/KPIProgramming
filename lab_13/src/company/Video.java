package company;

import java.util.HashSet;

public class Video {
    private String videoTitle;
    private String url;
    private long views;
    private long videoLikes;
    private long videoDislikes;
    private HashSet<Comments> listOfComments;

    public Video() {
        this.videoTitle = "";
        this.url = "";
        this.views = 0;
        this.videoLikes = 0;
        this.videoDislikes = 0;
        listOfComments = new HashSet<Comments>();
    }

    public Video(String videoTitle, String url, long views, long videoLikes, long videoDislikes, HashSet<Comments> listOfComments) {
        this.videoTitle = videoTitle;
        this.url = url;
        this.views = views;
        this.videoLikes = videoLikes;
        this.videoDislikes = videoDislikes;
        this.listOfComments = listOfComments;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public long getVideoLikes() {
        return videoLikes;
    }

    public void setVideoLikes(long videoLikes) {
        this.videoLikes = videoLikes;
    }

    public long getVideoDislikes() {
        return videoDislikes;
    }

    public void setVideoDislikes(long videoDislikes) {
        this.videoDislikes = videoDislikes;
    }

    public HashSet<Comments> getListOfComments() {
        return listOfComments;
    }

    public void setListOfComments(HashSet<Comments> listOfComments) {
        this.listOfComments = listOfComments;
    }

    @Override
    public String toString() {
        return "Video: " +
                "videoTitle='" + videoTitle + '\'' +
                ", url='" + url + '\'' +
                ", views=" + views +
                ", videoLikes=" + videoLikes +
                ", videoDislikes=" + videoDislikes +
                ", ListOfComments=" + listOfComments;
    }
}