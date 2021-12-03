package company;

public class MyException extends Exception{
    private final int detail;


    public MyException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{"
                + "detail = " + detail
                + ", message = " + getMessage()
                + "} ";
    }
}
