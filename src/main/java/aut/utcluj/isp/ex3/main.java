package aut.utcluj.isp.ex3;

public class main {
    public static void main(String[] args) {
        Product bere = new Product("id1", "ursus", 2.0);
        Product salam = new Product("id2", "Salam de Sibiu", 6.0);

        StockController stockController = new StockController();

        stockController.addProductToCatalogue(bere, 3);
        System.out.println(stockController.getTotalNumberOfProducts());
        stockController.addProductToCatalogue(salam, 2);
        stockController.addProductToCatalogue(new Product("id3","Eugenia",0.5),10);

        stockController.getCatalogue();
        System.out.println(stockController.getProductsWithSameId("id2"));
        System.out.println(stockController.getTotalNumberOfProducts());
        stockController.removeAllProductsWithProductId("id2");
    }
}
