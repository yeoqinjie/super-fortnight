public class UseOfTwoException extends Exception {
    public UseOfTwoException() {
        super("Use of number TWO is disallowed.");
    }

    public UseOfTwoException(String msg) {
        super(msg);
    }
}
