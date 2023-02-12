/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> useraccountList;
    
    public UserAccountDirectory() {
        this.useraccountList = new ArrayList<UserAccount>();
    }
    
    public UserAccount createUserAccount (String username, String password, String role){
        UserAccount user = new UserAccount(username, password, role);
        
        useraccountList.add(user);
        return user;
    }
    
    public UserAccount findById(String id){
        for(UserAccount u: this.useraccountList){
            if(u.getAccountId().equals(id)){
                return u;
            }
        }
        return null;
    }
    
    public UserAccount getUserAccount (String username, String password, String role) {
        for(UserAccount u: this.useraccountList){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                return u;
            }
        }
        return null;
    }
    
    
    public Boolean accountExists (String username, String password, String role) {
        for(UserAccount u: this.useraccountList){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                return true;
            }
        }
        return false;
    }
}
