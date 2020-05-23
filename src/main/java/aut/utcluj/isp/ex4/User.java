package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class User {
    private UserCart userCart;
    private Double userMoney;

    public User(Double userMoney) {
        this.userMoney = userMoney;
        userCart = new UserCart();
    }

    public UserCart getUserCart() {
        return userCart;
    }

    public Double getUserMoney() {
        return userMoney;
    }

    /**
     * Add product to the cart
     *
     * @param product  - product to be added
     * @param quantity - quantity to be added
     */
    public void addProductToCart(Product product, int quantity) {
        userCart.addProductToCart(product, quantity);
       // userMoney -= (product.getPrice() * quantity);
    }

    /**
     * Remove product from cart
     * An {@link ProductNotFoundException} exception should be thrown if no product with desired productId is found
     *
     * @param productId - unique product id
     */
    public void removeProductFromCart(final String productId) throws ProductNotFoundException {
        int found = 0;
        int i;
        Product product=null;
        for (i = 0; i < userCart.getCardProducts().size(); i++) {
            if (userCart.getCardProducts().get(i).getProductId().equals(productId)) {
                found += 1;
                product = userCart.getCardProducts().get(i);
            }
        }
        if (product == null) {
            throw new ProductNotFoundException("Product not found");
        }

        for (i = 0; i < found; i++) {
            userCart.removeProductFromCart(productId);
           // userMoney -= product.getPrice();
        }

    }

    /**
     * Submit cart details
     * Total price of the products should be extracted from userMoney
     * If userMoney is less than total price of the products, an {@link NotEnoughMoneyException} exception will be thrown
     * If userMoney is greater or equal to the total price of the products, total price should be extracted from total money and cart to be reset to default values
     */
    public void submitCart()  throws NotEnoughMoneyException{
        if(userMoney < userCart.getTotalPrice()){
            throw new  NotEnoughMoneyException(" Not enough money!");
        }
       userMoney -= userCart.getTotalPrice();
        userCart.resetCart();
    }
}
