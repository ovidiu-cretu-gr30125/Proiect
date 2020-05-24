package aut.utcluj.isp.ex4;

import jdk.nashorn.internal.scripts.JD;

import javax.sql.rowset.JdbcRowSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class View {
    private JFrame frame;
    private JLabel labelForProductId;
    private JLabel labelForProductPrice;
    private JLabel labelForProductQuantity;
    private JTextField textFieldForProductId;
    private JTextField textFieldForProductPrice;
    private JTextField textFieldForProductQuantity;
    private JButton buttonAddProductsToCart;
    private JButton buttonRemoveProductFromCart;
    private JButton buttonPayForProducts;
    private JButton buttonCartDetails;
    private JDialog dialogForCartDetails;
    private JTextArea textAreaForCartDetails;
    private JScrollPane scrollPaneForCartDetails;

    public View(String title){
        frame = new JFrame(title);
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(560, 120);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new java.awt.Color(0, 0, 0, 196));

        labelForProductId = new JLabel("Product Id:");
        textFieldForProductId = new JTextField();
        labelForProductPrice = new JLabel("Product price:");
        textFieldForProductPrice = new JTextField();
        labelForProductQuantity = new JLabel("Product quantity:");
        textFieldForProductQuantity = new JTextField();
        buttonAddProductsToCart = new JButton("Add to cart");
        buttonRemoveProductFromCart = new JButton("Remove from cart");
        buttonPayForProducts = new JButton("Pay");
        buttonCartDetails = new JButton("Get cart details");
        dialogForCartDetails = new JDialog();
        textAreaForCartDetails = new JTextArea();
        scrollPaneForCartDetails = new JScrollPane(textAreaForCartDetails);


        labelForProductId.setBounds(5,5,65,25);
        labelForProductId.setForeground(Color.white);
        labelForProductId.setVisible(true);
        frame.add(labelForProductId);

        textFieldForProductId.setBounds(70,5,50,25);
        textFieldForProductId.setVisible(true);
        frame.add(textFieldForProductId);

        labelForProductPrice.setBounds(125,5,85,25);
        labelForProductPrice.setForeground(Color.white);
        labelForProductPrice.setVisible(true);
        frame.add(labelForProductPrice);

        textFieldForProductPrice.setBounds(215,5,75,25);
        textFieldForProductPrice.setVisible(true);
        frame.add(textFieldForProductPrice);

        labelForProductQuantity.setBounds(295,5,100,25);
        labelForProductQuantity.setForeground(Color.white);
        labelForProductQuantity.setVisible(true);
        frame.add(labelForProductQuantity);

        textFieldForProductQuantity.setBounds(400,5,50,25);
        textFieldForProductQuantity.setVisible(true);
        frame.add(textFieldForProductQuantity);

        buttonAddProductsToCart.setBounds(10,40,105,25);
        buttonAddProductsToCart.setVisible(true);
        frame.add(buttonAddProductsToCart);

        buttonRemoveProductFromCart.setBounds(120,40,150,25);
        buttonRemoveProductFromCart.setVisible(true);
        frame.add(buttonRemoveProductFromCart);

        buttonCartDetails.setBounds(275,40,125,25);
        buttonCartDetails.setVisible(true);
        frame.add(buttonCartDetails);

        buttonPayForProducts.setBounds(405,40,130,25);
        buttonPayForProducts.setVisible(true);
        frame.add(buttonPayForProducts);

        dialogForCartDetails.setSize(500,225);
        dialogForCartDetails.getContentPane().setLayout(null);
        dialogForCartDetails.setLocationRelativeTo(null);
        dialogForCartDetails.getContentPane().setBackground(new java.awt.Color(0, 0, 0, 196));

        scrollPaneForCartDetails.setBounds(10,10,465,165);
        scrollPaneForCartDetails.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        dialogForCartDetails.getContentPane().add(scrollPaneForCartDetails);

        frame.setVisible(true);


    }

    public JButton getButtonAddProductsToCart() {
        return buttonAddProductsToCart;
    }

    public JButton getButtonCartDetails() {
        return buttonCartDetails;
    }

    public JButton getButtonPayForProducts() {
        return buttonPayForProducts;
    }

    public JButton getButtonRemoveProductFromCart() {
        return buttonRemoveProductFromCart;
    }

    public JDialog getDialogForCartDetails() {
        return dialogForCartDetails;
    }

    public JTextArea getTextAreaForCartDetails() {
        return textAreaForCartDetails;
    }

    public JTextField getTextFieldForProductId() {
        return textFieldForProductId;
    }

    public JTextField getTextFieldForProductPrice() {
        return textFieldForProductPrice;
    }

    public JTextField getTextFieldForProductQuantity() {
        return textFieldForProductQuantity;
    }
}
