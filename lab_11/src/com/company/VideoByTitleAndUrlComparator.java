package com.company;

import java.util.Comparator;

public class VideoByTitleAndUrlComparator implements Comparator<Video> {

    @Override
    public int compare(Video v1, Video v2) {
        int res = v1.getVideoTitle().compareTo(v2.getVideoTitle());
        if (res == 0){
            res = v1.getUrl().compareTo(v2.getUrl());
        }
        return res;
    }
}
