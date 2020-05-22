package aut.utcluj.isp.ex3;

import java.util.*;

/**
 * @author stefan
 */
public class StockController {
    /**
     * Add product to catalogue
     *
     * @param product  - product information
     * @param quantity - number of times the product should be added
     * @apiNote: if products with the same products id already exists, assume that @param product has the same data
     */
    private Map<String, Product> catalogueProducts = new HashMap<String, Product>();
    private List<Product> productList = new ArrayList<>();

    public void addProductToCatalogue(final Product product, final int quantity) {

        if (!catalogueProducts.containsKey(product.getId())) {
            catalogueProducts.put(product.getId(), product);
        }
        for (int i = 0; i < quantity; i++) {
            productList.add(product);
        }
    }

    /**
     * Return catalogue information
     *
     * @return dictionary where the key is the product id and the value is an array of products with the same id
     */

    public Map<String, Product> getCatalogue() {

        System.out.println();
        System.out.println("Catalogue of products:" + "\n" + catalogueProducts);
        System.out.println("\n");
        return catalogueProducts;
    }

    /**
     * Return all the products with particular id
     *
     * @param productId - unique product id
     * @return - list of existing products with same id or null if not found
     */
    public List<Product> getProductsWithSameId(final String productId) {

        int productFound = 0;
        System.out.println("List of products with " + productId + ":");
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(productId)) {
                System.out.print(productList.get(i));
                return productList;
                ///productFound = 1;
            }
        }
        System.out.println("\n");
        return null;
        /*if (productFound == 1)
            return productList;
        else
            return null;
    }*/
    }

    /**
     * Get total number of products from catalogue
     *
     * @return
     */
    public int getTotalNumberOfProducts() {
        return productList.size();
    }

    /**
     * Remove all products with same product id
     *
     * @param productId - unique product id
     * @return true if at least one product was deleted or false instead
     */
    public boolean removeAllProductsWithProductId(final String productId) {
        int deleted = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(productId)) {
                deleted = 1;
                productList.remove(i);
                i--;
            }
        }

        if (deleted == 0)
            return false;
        else
            return true;
    }

    /**
     * Update the price for all the products with same product id
     *
     * @param productId - unique product id
     * @param price     - new price to be added
     * @return true if at least one product was updated or false instead
     */
    public boolean updateProductPriceByProductId(final String productId, final Double price) {
        throw new UnsupportedOperationException("Not supported yet.");

    }
}
