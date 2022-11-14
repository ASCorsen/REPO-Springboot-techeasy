package nl.andrew.techiteasy.exceptions;

public class RecordNotFoundException extends RuntimeException {
//    private static final long serialVersionUID = 1L; (serial)
    public RecordNotFoundException() {
        super();
    }
    public RecordNotFoundException(String message) {
        super(message);
    }
}