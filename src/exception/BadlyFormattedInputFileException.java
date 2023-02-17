package exception;

public class BadlyFormattedInputFileException extends Exception {
    private static final String errorMessage = "Badly Formatted File";

    public BadlyFormattedInputFileException() {
        super(errorMessage);
    }
}
