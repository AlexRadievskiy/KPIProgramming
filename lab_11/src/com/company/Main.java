package com.company;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Первое видео
        Comments firstComment = new Comments("The best", 7, 3223);
        Comments secondComment = new Comments("+Like", 20, 32);
        Video firstVideo = new Video("hi", "https://linkOne", 321, 21, 9, Set.of(firstComment, secondComment));
        //Второе видео
        Comments thirdComment = new Comments("Terrible", 6, 64);
        Comments fourthComment = new Comments("Super", 12, 54);
        Video secondVideo = new Video ("New video", "https://linkTwo", 542, 0, 7, Set.of(thirdComment, fourthComment));
        //Третье видео
        Comments fifthComment = new Comments("Cool", 423, 3223);
        Comments sixthComment = new Comments("Very sad", 2342, 32);
        Video thirdVideo = new Video("Nev music", "https://linkThree", 231, 11, 12, Set.of(fifthComment, sixthComment));
        //Четверное видео
        Comments comment6 = new Comments("Coool", 42, 28);
        Comments comment7 = new Comments("I'll win", 32, 121);
        Video fourthVideo = new Video ("New competition", "https://linkFour", 212, 0, 32, Set.of(comment6,comment7));

        Videoblog firstVideoBlog = new Videoblog("Marmok", Set.of(firstVideo, secondVideo));
        Videoblog SecondVideoBlog = new Videoblog("Unknown", Set.of(thirdVideo, fourthVideo));

        System.out.println(firstVideoBlog.allVideos()); //Общее количество просмотров
        System.out.println(firstVideoBlog.moreCommentLikesThanVideoLikes()); //Лайков у комментария больше чем у видео
        System.out.println(firstVideoBlog.maxVideoDislikes()); //Больше всего дизлайков
    }
}
