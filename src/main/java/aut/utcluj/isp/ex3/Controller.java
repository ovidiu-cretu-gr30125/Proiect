
package aut.utcluj.isp.ex3;
import aut.utcluj.isp.ex1.Shop;

import javax.swing.*;
import java.awt.*;

public class Controller {
    private StockController stockController;
    private View view;

    public Controller(StockController sc,View v){
        this.stockController=sc;
        this.view=v;
    }
    public void initController() {
        view.getAddProductToCatalogue().addActionListener(e -> addToCatalogue());
        view.getRemoveAllProductsWithProductId().addActionListener(e -> removeProductsById());
        view.getUpdateProductPriceByProductId().addActionListener(e -> updateProductPriceById());
        view.getGetTotalNumberOfProducts().addActionListener(e -> getTotalNumberOfProducts());
        view.getGetProductsWithSameId().addActionListener(e -> getProductsListWithSameId());
    }

    public void addToCatalogue(){
        if(!view.getProductIdTextField().getText().equals("") && !view.getProductNameTextField().getText().equals("") && !view.getProductPriceTextField().getText().equals("") && !view.getProductQuantityTextField().getText().equals("")) {
            stockController.addProductToCatalogue(new Product(view.getProductIdTextField().getText(), view.getProductNameTextField().getText(), Double.parseDouble(view.getProductPriceTextField().getText())), Integer.parseInt(view.getProductQuantityTextField().getText()));
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter data for the product","Error",JOptionPane.WARNING_MESSAGE);
        }
        view.getProductIdTextField().setText("");
        view.getProductNameTextField().setText("");
        view.getProductPriceTextField().setText("");
        view.getProductQuantityTextField().setText("");
    }

    public void removeProductsById(){
        if(!view.getProductIdTextField().getText().equals("")) {
            stockController.removeAllProductsWithProductId(view.getProductIdTextField().getText());
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter ID","Error",JOptionPane.WARNING_MESSAGE);
        }
        view.getProductIdTextField().setText("");
    }

    public void updateProductPriceById(){
        if(!view.getProductIdTextField().getText().equals("") && !view.getProductIdTextField().getText().equals("")) {
            stockController.updateProductPriceByProductId(view.getProductIdTextField().getText(), Double.parseDouble(view.getProductPriceTextField().getText()));
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter the Id and price!","Error",JOptionPane.WARNING_MESSAGE);
        }
        view.getProductIdTextField().setText("");
        view.getProductPriceTextField().setText("");

    }

    public void getTotalNumberOfProducts(){
        if(stockController.getCatalogue() != null){
            JOptionPane.showMessageDialog(null,stockController.getTotalNumberOfProducts(),"Total number of products", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"No products","Total number of products", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void getProductsListWithSameId(){
        if(stockController.getCatalogue()==null || stockController.getProductsWithSameId(view.getProductIdTextField().getText())==null){
            JOptionPane.showMessageDialog(null,"No products","",JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(!view.getProductIdTextField().getText().equals("")) {
                view.getDialogProductsById().setVisible(true);
                view.getTextAreaForProducts().setText(stockController.getProductsWithSameId(view.getProductIdTextField().getText()).toString());
                view.getProductIdTextField().setText("");
            }
            else {
                JOptionPane.showMessageDialog(null,"Enter ID","",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}