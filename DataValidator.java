package HomeWork;

public class DataValidator {
    private static final int REQUIRED_DATA_COUNT = 6;

    public static void validate(String[] data) throws DataException {
        if (data.length < REQUIRED_DATA_COUNT) {
            throw new DataException(DataException.LESS_DATA_ERROR);
        } else if (data.length > REQUIRED_DATA_COUNT) {
            throw new DataException(DataException.MORE_DATA_ERROR);
        }
    }
}
