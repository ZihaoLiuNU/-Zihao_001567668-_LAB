/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class DeliveryPackage {
    int packageID;
    double packageWeight;
    ArrayList<Product> productList;
    Customer customer;
    
    public DeliveryPackage(){
        this.productList = new ArrayList<Product>();
        this.customer = new Customer();
}

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
//    add product to product list
    
    public Product createProduct(int productID, String productName, double price){
        Product product = new Product();
        product.setProductID(productID);
        product.setProductName(productName);
        product.setPrice(price);
        
        this.productList.add(product);
        
        return product;
    }
    
    public Product findProduct(int pid){
        for(Product prod: this.productList){
            if(prod.getProductID() == pid){
                return prod;
            }
        }
        return null;
    }
    
}
