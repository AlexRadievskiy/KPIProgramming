package company;

public class Comments {
    private String commentText;
    private long aNumberOfLikes;
    private long aNumberOfDislikes;

    public Comments(String commentText, long aNumberOfLikes, long aNumberOfDislikes) {
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

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public long getNumberOfLikes() {
        return aNumberOfLikes;
    }

    public void setNumberOfLikes(long aNumberOfLikes) {
        this.aNumberOfLikes = aNumberOfLikes;
    }

    public long getNumberOfDislikes() {
        return aNumberOfDislikes;
    }

    public void setNumberOfDislikes(long aNumberOfDislikes) {
        this.aNumberOfDislikes = aNumberOfDislikes;
    }

    @Override
    public String toString() {
        return "Comments: " +
                "commentText='" + commentText + '\'' +
                ", aNumberOfLikes=" + aNumberOfLikes +
                ", aNumberOfDislikes=" + aNumberOfDislikes;
    }
}
