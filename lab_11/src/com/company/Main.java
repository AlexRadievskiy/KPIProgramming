package com.company;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Первое видео
        Comments firstComment = new Comments("wow", 7, 3223);
        Comments secondComment = new Comments("cool", 20, 32);
        Video firstVideo = new Video("hi", "hhtp1", 321, 21, 9, Set.of(firstComment, secondComment));
        //Второе видео
        Comments thirdComment = new Comments("super", 6, 64);
        Comments fourthComment = new Comments("great", 12, 54);
        Video secondVideo = new Video ("hello", "http2", 542, 0, 7, Set.of(thirdComment, fourthComment));
        //Третье видео
        Comments fifthComment = new Comments("how", 423, 3223);
        Comments sixthComment = new Comments("what", 2342, 32);
        Video thirdVideo = new Video("good", "hhtp3", 231, 11, 12, Set.of(fifthComment, sixthComment));
        //Четверное видео
        Comments comment6 = new Comments("goofy", 42, 28);
        Comments comment7 = new Comments("scary", 32, 121);
        Video fourthVideo = new Video ("addictive", "http4", 212, 0, 32, Set.of(comment6,comment7));

        Videoblog firstVideoblog = new Videoblog("Anna", Set.of(firstVideo, secondVideo));

        Videoblog SecondVideoBlog = new Videoblog("Bob", Set.of(thirdVideo, fourthVideo));

        System.out.println("загальна сумарна кількість переглядів усіх відео разом: " + "\n" + firstVideoblog.allVideos() + "\n");
        System.out.println("чи є коментар, що набрав лайків більше, ніж відео, до якого він дописаний: "+ "\n" + firstVideoblog.moreCommentLikesThanVideoLikes() + "\n");
        System.out.println("список відео які набрали найбільшу кількість дизлайків:"+ "\n" + firstVideoblog.maxVideoDislikes() + "\n");
    }
}
