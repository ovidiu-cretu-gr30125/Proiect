package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
