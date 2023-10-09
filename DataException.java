package HomeWork;

public class DataException extends Exception {
    public static final int LESS_DATA_ERROR = 1;
    public static final int MORE_DATA_ERROR = 2;
    private final int errorCode;

    public DataException(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
