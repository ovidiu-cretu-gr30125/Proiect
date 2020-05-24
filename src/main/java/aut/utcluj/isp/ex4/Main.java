package aut.utcluj.isp.ex4;

public class Main {

    public static void main(String[] args) {
        UserCart userCart1 = new UserCart();
        View view1 = new View("User Cart");
        Controller controller = new Controller(userCart1,view1);
        controller.initController();
    }
}
