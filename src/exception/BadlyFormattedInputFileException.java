package exception;

/**
 * Custom Exception for the Badly formatted input files
 */
public class BadlyFormattedInputFileException extends Exception {
    private static final String errorMessage = "Badly Formatted File";

    public BadlyFormattedInputFileException() {
        super(errorMessage);
    }
}
