package day40_exception.bank;

//TODO: manage the code to give the CUSTOM exception
public class NotEnoughBalanceException extends RuntimeException {
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}