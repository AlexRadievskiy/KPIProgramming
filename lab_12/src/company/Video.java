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

    public String getUrl() {
        return url;
    }

    public long getViews() {
        return views;
    }

    public long getVideoLikes() {
        return videoLikes;
    }

    public long getVideoDislikes() {
        return videoDislikes;
    }

    public HashSet<Comments> getListOfComments() {
        return listOfComments;
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