package com.company;

public class Comments implements Comparable <Comments>{
    private String commentText;
    private int aNumberOfLikes;
    private int aNumberOfDislikes;

    public Comments(String commentText, int aNumberOfLikes, int aNumberOfDislikes) {
        this.commentText = commentText;
        this.aNumberOfLikes = aNumberOfLikes;
        this.aNumberOfDislikes = aNumberOfDislikes;
    }

    public Comments() {
        commentText = "";
        aNumberOfLikes = 0;
        aNumberOfDislikes = 0;
    }

    public String getCommentText() {
        return commentText;
    }

    public int getaNumberOfLikes() {
        return aNumberOfLikes;
    }

    public int getaNumberOfDislikes() {
        return aNumberOfDislikes;
    }

    @Override
    public int compareTo(Comments co) {
        int res = co.getaNumberOfLikes() - this.getaNumberOfLikes();
        if (res == 0) {
            res = co.getaNumberOfDislikes() - this.getaNumberOfDislikes();
            if (res == 0) {
                res = this.getCommentText().compareTo(co.getCommentText());
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Comments: " +
                "commentText='" + commentText + '\'' +
                ", aNumberOfLikes=" + aNumberOfLikes +
                ", aNumberOfDislikes=" + aNumberOfDislikes;
    }
}
