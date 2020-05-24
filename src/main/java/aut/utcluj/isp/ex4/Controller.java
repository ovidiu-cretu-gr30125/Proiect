package aut.utcluj.isp.ex4;

import javax.swing.*;
import java.util.Comparator;

public class Controller {

    private UserCart userCart;
    private View view;

    public Controller(UserCart us,View v){
        this.userCart=us;
        this.view=v;
    }

    public void initController(){
        view.getButtonAddProductsToCart().addActionListener(e -> addToCart());
        view.getButtonRemoveProductFromCart().addActionListener(e -> {
            try {
                removeFormCart();
            } catch (ProductNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        view.getButtonCartDetails().addActionListener(e -> cartDetails());
        view.getButtonPayForProducts().addActionListener(e -> payForProducts());
    }

    public void addToCart(){
        if(!view.getTextFieldForProductId().getText().equals("") && !view.getTextFieldForProductPrice().getText().equals("") && !view.getTextFieldForProductQuantity().getText().equals("")){
            userCart.addProductToCart(new Product(view.getTextFieldForProductId().getText(),Double.parseDouble(view.getTextFieldForProductPrice().getText())),Integer.parseInt(view.getTextFieldForProductQuantity().getText()));
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter product data!","Error",JOptionPane.WARNING_MESSAGE);
        }
        view.getTextFieldForProductId().setText("");
        view.getTextFieldForProductPrice().setText("");
        view.getTextFieldForProductQuantity().setText("");
    }

    public void removeFormCart() throws ProductNotFoundException {
        if(!view.getTextFieldForProductId().getText().equals("")){
            userCart.removeProductFromCart(view.getTextFieldForProductId().getText());
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter Id","Error",JOptionPane.WARNING_MESSAGE);
        }
        view.getTextFieldForProductId().setText("");
    }

    public void cartDetails(){
        if(userCart.getCartDetails()==null){
            JOptionPane.showMessageDialog(null,"No products!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            view.getDialogForCartDetails().setVisible(true);
            view.getTextAreaForCartDetails().setText(userCart.getCartDetails());

        }
    }

    public void payForProducts(){
        if(userCart.getCartDetails()==null){
            JOptionPane.showMessageDialog(null,"No products in cart","",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"You payed "+userCart.getTotalPrice()+"","",JOptionPane.INFORMATION_MESSAGE);
            userCart.resetCart();
        }
    }

}
