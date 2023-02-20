/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Profile.Profile;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class Customer extends Profile{
    Profile p;
    RentalRequestDirectory rrd;
    
    public Customer() {
        super();
        this.rrd = new RentalRequestDirectory();
    }
   
}
