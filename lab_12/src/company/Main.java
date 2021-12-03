package company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Comments firstComment = new Comments("Best I've heard", 50, 240);
        Comments secondComment = new Comments("Very sad", 78, 423);
        HashSet<Comments> firstCommentsList = new HashSet<>();
        firstCommentsList.add(firstComment);
        firstCommentsList.add(secondComment);
        Video firstVideo = new Video("First title", "https://linkOne", 423, 898, 0, firstCommentsList);

        Comments thirdComment = new Comments("super", 321, 42);
        HashSet<Comments> secondCommentsList = new HashSet<>();

        secondCommentsList.add(thirdComment);
        Video secondVideo = new Video("Second title", "https://linkTwo", 432, 324, 0, secondCommentsList);

        HashSet<Video> videoList = new HashSet<>();
        videoList.add(firstVideo);
        videoList.add(secondVideo);

        VideoBlog videoblog = new VideoBlog("Georg", videoList);

        //ВЫВОД
        System.out.println(videoblog.allVideos()); //Общее количество просмотров
        System.out.println(videoblog.moreCommentLikesThanVideoLikes2()); //Лайков у комментария больше чем у видео
        System.out.println(videoblog.maxVideoDislikes()); //Больше всего дизлайков
        System.out.println(videoblog.videoTitleAndUrl());
    }
}