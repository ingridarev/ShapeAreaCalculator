package swed.itacademy.project;

public class UnknownShapeException extends Exception {

    private String message;

    public UnknownShapeException(String text) {
        this.message = text;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
