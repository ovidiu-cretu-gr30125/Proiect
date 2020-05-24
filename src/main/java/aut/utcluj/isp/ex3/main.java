package aut.utcluj.isp.ex3;



public class main {
    public static void main(String[] args) {
        StockController stockController1 = new StockController();
        View view = new View("Shop");
        Controller controller = new Controller(stockController1,view);
        controller.initController();
    }
}
