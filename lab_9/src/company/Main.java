package company;

public class Main {

    public static void main(String[] args) {

        int number = 21;
        String text = "The user with the nickname koala757677 this month wrote 3" +
                " times more comments than the user with the nickname croco181dile920 4 months ago";

        try {
            System.out.println(ToBinaryClass.toBinaryString(number));
            System.out.println(ToLowerCaseClass.toLowerCase(text));

        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}