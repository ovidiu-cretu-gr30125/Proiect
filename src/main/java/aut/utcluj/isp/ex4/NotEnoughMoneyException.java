package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String errorMessage) {
        super(errorMessage);
    }
}
