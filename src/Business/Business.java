/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustomerDirectory;
import Restaurant.DeliveryAgentDirectory;
import Services.MasterOrderList;

/**
 *
 * @author alilovepeach
 */
public class Business {
    private UserAccountDirectory uad;
    private CustomerDirectory cd;
    private DeliveryAgentDirectory dad;
    private MasterOrderList mol;
    
    public Business(){
        this.uad = new UserAccountDirectory();
        this.cd = new CustomerDirectory();
        this.dad = new DeliveryAgentDirectory();
        this.mol = new MasterOrderList();
        
        UserAccount user = this.uad.createUserAccount("admin", "admin", "manager");
    }
        
    public static Business getBusinessInstance(){
        return new Business();
    }

    public UserAccountDirectory getUad() {
        return uad;
    }

    public CustomerDirectory getCd() {
        return cd;
    }

    public DeliveryAgentDirectory getDad() {
        return dad;
    }

    public MasterOrderList getMol() {
        return mol;
    }
    
    
    
}
