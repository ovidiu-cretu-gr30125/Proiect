package aut.utcluj.isp.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author stefan
 */
public class UserCart implements ICartDetails {
    private List<Product> cardProducts;
    private double totalPrice;

    public UserCart() {
        this.cardProducts = new ArrayList<>();
        this.totalPrice = 0.0;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getCardProducts() {
        return cardProducts;
    }

    /**
     * Add new product to user cart
     *
     * @param product  - product to be added
     * @param quantity - number of products of the same type to be added
     */
    public void addProductToCart(final Product product, int quantity) {
        int numberOfProducts = 0;
        while (numberOfProducts < quantity) {
            cardProducts.add(product);
            numberOfProducts++;
        }
        totalPrice = product.getPrice() * quantity;
    }

    /**
     * Remove one product with product id from cart
     * If the product with desired id not found in the card, an {@link ProductNotFoundException} exception will be thrown
     *
     * @param productId - unique product id
     */
    public void removeProductFromCart(final String productId) throws ProductNotFoundException {
        int found = 0;

        for (int i = 0; i < cardProducts.size(); i++) {
            if (cardProducts.get(i).getProductId().equals(productId)) {
                cardProducts.remove(i);
                found = 1;
            }

        }
        if (found == 0) {
            throw new ProductNotFoundException("Product not found");
        }


    }

    /**
     * Reset user cart
     * Reset products and total price to default values
     */
    public void resetCart() {

        cardProducts.removeAll(getCardProducts());

        totalPrice = 0.0;
    }

    @Override
    public String getCartDetails() {

        for (int i = 0; i < cardProducts.size(); i++) {
            int quantity = 0;
            for (int j = i + 1; j < cardProducts.size(); j++) {
                if (cardProducts.get(i).getProductId().equals(cardProducts.get(j).getProductId())) {
                    quantity++;
                }
                System.out.println("product" + i + "items" + quantity);
                totalPrice = totalPrice + quantity * i;
            }
        }


        return "Total price: " + totalPrice;
    }
}