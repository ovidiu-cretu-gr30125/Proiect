package aut.utcluj.isp.ex3;

import java.util.List;

public class main {
    public static void main(String[] args) {
        /*Product smartphone = new Product("id1", "iphone", 2.0);
        Product laptop = new Product("id2", "macbook", 6.0);

        StockController stockController = new StockController();

        stockController.addProductToCatalogue(smartphone, 3);
        System.out.println(stockController.getTotalNumberOfProducts());
        stockController.addProductToCatalogue(laptop, 2);
        stockController.addProductToCatalogue(new Product("id3","applewatch",0.5),10);

        //stockController.getCatalogue();
       // System.out.println(stockController.getProductsWithSameId("id2"));
       // System.out.println(stockController.getTotalNumberOfProducts());
       // stockController.removeAllProductsWithProductId("id2");
       // stockController.getProductsWithSameId("id1");


        stockController.updateProductPriceByProductId("id1", 500.0);
        stockController.getProductsWithSameId("id2");
        stockController.getProductsWithSameId("id1");
        List<Product> p1Products = stockController.getProductsWithSameId("id1");
        for (Product prod: p1Products) {
            System.out.println(prod.getId());
            System.out.println(prod.getPrice());
        }*/
        StockController stockController1 = new StockController();
        View view = new View("Shop");
        Controller controller = new Controller(stockController1,view);
        controller.initController();

    }
}
