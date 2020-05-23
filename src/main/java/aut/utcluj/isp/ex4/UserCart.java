package aut.utcluj.isp.ex4;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;


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
        totalPrice += product.getPrice() * quantity;
    }

    /**
     * Remove one product with product id from cart
     * If the product with desired id not found in the card, an {@link ProductNotFoundException} exception will be thrown
     *
     * @param productId - unique product id
     */
    public void removeProductFromCart(final String productId) throws ProductNotFoundException {
        int found = 0;
        int i;
        Product product=null;
        for (i = 0; i < cardProducts.size(); i++) {
            if (cardProducts.get(i).getProductId().equals(productId)) {
                found = 1;
                product=cardProducts.get(i);
                break;
            }

        }
        if (found == 0) {
            throw new ProductNotFoundException("Product not found");
        }
        cardProducts.remove(i);
        totalPrice -= product.getPrice();

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
       double detailPrice = 0;
        Map<Product, Integer> products = new HashMap<>();

        for (Product product : cardProducts) {
            if (!products.containsKey(product)) {
                products.put(product, 0);
            }
            products.put(product, products.get(product) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (Product key : products.keySet()) {
            result.append("Product id: ").append(key.getProductId()).append(", Items: ").append(products.get(key)).append("\n");
            detailPrice += (key.getPrice() * products.get(key));
        }
        result.append("Total price: ").append(detailPrice);

        return result.toString();
    }
}