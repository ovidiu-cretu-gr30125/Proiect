package aut.utcluj.isp.ex3;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class View {

    private JFrame frame;
    private JLabel productIdLabel;
    private JLabel productNameLabel;
    private JLabel productPriceLabel;
    private JLabel productQuantityLabel;
    private JTextField productIdTextField;
    private JTextField productNameTextField;
    private JTextField productPriceTextField;
    private JTextField productQuantityTextField;
    private JButton addProductToCatalogue;
    private JButton getProductsWithSameId;
    private JButton getTotalNumberOfProducts;
    private JButton removeAllProductsWithProductId;
    private JButton updateProductPriceByProductId;
    private JDialog dialogProductsById;
    private JTextArea textAreaForProducts;
    private JScrollPane scrollPaneForProducts;



    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 120);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new java.awt.Color(0, 0, 0, 196));


        // Create UI elements
        productIdLabel = new JLabel("Product id:");
        productIdTextField = new JTextField();
        productNameLabel = new JLabel("Product name:");
        productNameTextField = new JTextField();
        productPriceLabel = new JLabel("Product price:");
        productPriceTextField = new JTextField();
        productQuantityLabel = new JLabel("Product quantity:");
        productQuantityTextField = new JTextField();
        addProductToCatalogue = new JButton("Add product");
        getProductsWithSameId = new JButton("Get products");
        getTotalNumberOfProducts = new JButton("Get all products");
        removeAllProductsWithProductId = new JButton("Remove product");
        updateProductPriceByProductId = new JButton("Update product");
        dialogProductsById = new JDialog();
        textAreaForProducts = new JTextArea();
        scrollPaneForProducts = new JScrollPane(textAreaForProducts);


        // Add UI element to frame
        productIdLabel.setBounds(5,5,65,25);
        productIdLabel.setForeground(Color.white);
        productIdLabel.setVisible(true);
        frame.add(productIdLabel);

        productIdTextField.setBounds(70,5,50,25);
        productIdTextField.setVisible(true);
        frame.add(productIdTextField);

        productNameLabel.setBounds(125,5,85,25);
        productNameLabel.setForeground(Color.white);
        productNameLabel.setVisible(true);
        frame.add(productNameLabel);

        productNameTextField.setBounds(215,5,75,25);
        productNameTextField.setVisible(true);
        frame.add(productNameTextField);

        productPriceLabel.setBounds(295,5,85,25);
        productPriceLabel.setForeground(Color.white);
        productPriceLabel.setVisible(true);
        frame.add(productPriceLabel);

        productPriceTextField.setBounds(385,5,50,25);
        productPriceTextField.setVisible(true);
        frame.add(productPriceTextField);

        productQuantityLabel.setBounds(440,5,100,25);
        productQuantityLabel.setForeground(Color.white);
        productQuantityLabel.setVisible(true);
        frame.add(productQuantityLabel);

        productQuantityTextField.setBounds(545,5,50,25);
        productQuantityTextField.setVisible(true);
        frame.add(productQuantityTextField);

        addProductToCatalogue.setBounds(10,40,105,25);
        addProductToCatalogue.setVisible(true);
        frame.add(addProductToCatalogue);

        getProductsWithSameId.setBounds(120,40,110,25);
        getProductsWithSameId.setVisible(true);
        frame.add(getProductsWithSameId);

        getTotalNumberOfProducts.setBounds(235,40,125,25);
        getTotalNumberOfProducts.setVisible(true);
        frame.add(getTotalNumberOfProducts);

        removeAllProductsWithProductId.setBounds(365,40,130,25);
        removeAllProductsWithProductId.setVisible(true);
        frame.add(removeAllProductsWithProductId);

        updateProductPriceByProductId.setBounds(500,40,125,25);
        updateProductPriceByProductId.setVisible(true);
        frame.add(updateProductPriceByProductId);

        dialogProductsById.setSize(500,225);
        dialogProductsById.getContentPane().setLayout(null);
        dialogProductsById.setLocationRelativeTo(null);
        dialogProductsById.getContentPane().setBackground(new java.awt.Color(0, 0, 0, 196));

        scrollPaneForProducts.setBounds(10,10,465,165);
        scrollPaneForProducts.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        dialogProductsById.getContentPane().add(scrollPaneForProducts);



        frame.setVisible(true);
    }
    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }


    public JDialog getDialogProductsById() {
        return dialogProductsById;
    }

    public JTextArea getTextAreaForProducts() {
        return textAreaForProducts;
    }

    public void setProductIdLabel (JLabel productIdLabel){
        this.productIdLabel=productIdLabel;
    }

    public JTextField getProductIdTextField() {
        return productIdTextField;
    }

    public void setProductIdTextField (JTextField productIdTextField){
        this.productIdTextField=productIdTextField;
    }

    public JTextField getProductNameTextField() {
        return productNameTextField;
    }

    public void setProductNameLabel (JLabel productNameLabel){
        this.productNameLabel=productNameLabel;
    }

    public JTextField getProductPriceTextField() {
        return productPriceTextField;
    }

    public void setProductNameTextField(JTextField productNameTextField){
        this.productNameTextField=productNameTextField;
    }

    public JTextField getProductQuantityTextField() {
        return productQuantityTextField;
    }

    public void setProductPriceLabel(JLabel productPriceLabel){
        this.productPriceLabel=productPriceLabel;
    }

    public void setProductPriceTextField(JTextField productPriceTextField){
        this.productPriceTextField=productPriceTextField;
    }

    public void setProductQuantityLabel(JLabel productQuantityLabel){
        this.productQuantityLabel=productQuantityLabel;
    }

    public void setProductQuantityTextField(JTextField productQuantityTextField){
        this.productQuantityTextField=productQuantityTextField;
    }

    public JButton getAddProductToCatalogue() {
        return addProductToCatalogue;
    }
    public void setAddProductToCatalogue(JButton addProductToCatalogue) {
        this.addProductToCatalogue = addProductToCatalogue;
    }
    public JButton getGetProductsWithSameId() {
        return getProductsWithSameId;
    }
    public void setGetProductsWithSameId(JButton getProductsWithSameId) {
        this.getTotalNumberOfProducts = getProductsWithSameId;
    }
    public JButton getRemoveAllProductsWithProductId() {
        return removeAllProductsWithProductId;
    }
    public void setRemoveAllProductsWithProductId(JButton removeAllProductsWithProductId) {
        this.removeAllProductsWithProductId = removeAllProductsWithProductId;
    }
    public JButton getUpdateProductPriceByProductId() {
        return updateProductPriceByProductId;
    }
    public void setUpdateProductPriceByProductId(JButton updateProductPriceByProductId) {
        this.updateProductPriceByProductId = updateProductPriceByProductId;
    }

    public JButton getGetTotalNumberOfProducts(){return getTotalNumberOfProducts;}
    public void setGetTotalNumberOfProducts(JButton getTotalNumberOfProducts){
        this.getTotalNumberOfProducts=getTotalNumberOfProducts;
    }
}

