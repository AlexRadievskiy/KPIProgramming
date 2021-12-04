package company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class VideoBlog {
    private final HashMap <String, String> titleAndUrlMap = new HashMap<>();
    private final String videoblogger;
    private final HashSet<Video> videoSet;

    public VideoBlog(String videoblogger, HashSet<Video> videoSet) {
        this.videoblogger = videoblogger;
        this.videoSet = videoSet;
    }

    public VideoBlog() {
        this.videoblogger = "";
        this.videoSet = new HashSet<>();
    }

    public String getVideoblogger() {
        return videoblogger;
    }

    public HashSet<Video> getvideoSet() {
        return videoSet;
    }

    public HashMap<String, String> getTitleAndUrlMap() {
        return titleAndUrlMap;
    }

    //Не типизированный итератор;
    public long allVideos() throws MyException {
        long videoSum = 0;
        for (Iterator i = videoSet.iterator(); i.hasNext(); ) {
            Object o = i.next();
            if (o instanceof Video)
                videoSum += ((Video) o).getViews();
        }
        return videoSum;
    }
    //Типизированный цикл «for-each»;
    public boolean moreCommentLikesThanVideoLikes2() throws MyException {
        for (Video vid : videoSet) {
            for (Comments co : vid.getListOfComments()) {
                if (vid.getVideoLikes() < co.getNumberOfLikes()) {
                    return true;
                }
            }
        }
        return false;
    }

    //Типизированный итератор;
    public HashSet<String> maxVideoDislikes() throws MyException {
        HashSet<String> maxDislikes = new HashSet<>();
        if (worstVideo().getVideoLikes() == 0) {
            return new HashSet<>();
        }
        long number = worstVideo().getVideoDislikes();
        for (Iterator<Video> i = videoSet.iterator(); i.hasNext(); ) {
            Video vid = i.next();
            if (vid.getVideoDislikes() >= number) {
                maxDislikes.add(vid.getVideoTitle());
                number = vid.getVideoDislikes();
            }

        }
        return maxDislikes;
    }

    public Video worstVideo() throws MyException {
        Video worst = new Video();
        for (Iterator<Video> i = videoSet.iterator(); i.hasNext(); ) {
            Video obj = i.next();
            if (worst.getVideoDislikes() <= obj.getVideoDislikes()) {
                worst = obj;
            }
        }
        return worst;
    }

    public StringBuilder getStatisticOfVideos() {
        StringBuilder outString = new StringBuilder("Title:\tURL:");
        for (Map.Entry<String, String> entry : videoTitleAndUrl().entrySet()) {
            String title = entry.getKey();
            String url = entry.getValue();
            outString.append("\n").append(title).append("\t").append(url);
        }
        return outString;
    }

    public HashMap<String, String> videoTitleAndUrl(){
        for (Video vid: videoSet){
            titleAndUrlMap.put(vid.getVideoTitle(), vid.getUrl());
        }
        return titleAndUrlMap;
    }

    @Override
    public String toString() {
        return "Videoblog: " +
                "videoblogger='" + videoblogger + '\'' +
                ", videoSet=" + videoSet;
    }
}