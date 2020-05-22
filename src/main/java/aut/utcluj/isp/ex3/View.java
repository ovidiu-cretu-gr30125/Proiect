package aut.utcluj.isp.ex3;

import java.awt.*;
import javax.swing.*;

public class View {

    private JFrame frame;
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JTextField firstnameTextfield;
    private JTextField lastnameTextfield;
    private JButton addProductToCatalogue;
    private JButton getProductsWithSameId;
    private JButton getTotalNumberOfProducts;
    private JButton removeAllProductsWithProductId;
    private JButton updateProductPriceByProductId;


    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // Create UI elements
        addProductToCatalogue = new JButton("add");
        getProductsWithSameId = new JButton("prod");
        getTotalNumberOfProducts = new JButton("total");
        removeAllProductsWithProductId = new JButton("rmv");
        updateProductPriceByProductId = new JButton("upd");


        // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameLabel)
                        .addComponent(lastnameLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameTextfield)
                        .addComponent(lastnameTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(addProductToCatalogue)
                        .addComponent(getProductsWithSameId).addComponent(getTotalNumberOfProducts)
                        .addComponent(removeAllProductsWithProductId).addComponent(updateProductPriceByProductId)));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(firstnameLabel)
                        .addComponent(firstnameTextfield).addComponent(addProductToCatalogue).addComponent(getTotalNumberOfProducts)
                        .addComponent(getProductsWithSameId).addComponent(removeAllProductsWithProductId).addComponent(updateProductPriceByProductId))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lastnameLabel)
                        .addComponent(lastnameTextfield)));
        layout.linkSize(SwingConstants.HORIZONTAL, addProductToCatalogue, getProductsWithSameId, getTotalNumberOfProducts);
        layout.linkSize(SwingConstants.HORIZONTAL, removeAllProductsWithProductId, updateProductPriceByProductId);
        frame.getContentPane().setLayout(layout);
    }
    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
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
}

