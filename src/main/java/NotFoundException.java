public class NotFoundException extends RuntimeException {

    public NotFoundException(int s) {
        super(String.valueOf(s));
    }
}
