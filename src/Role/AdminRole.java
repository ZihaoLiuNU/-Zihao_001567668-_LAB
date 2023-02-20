/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Library.Library;
import UI.AdminWorkArea.AdminJFrame;
import javax.swing.JFrame;

/**
 *
 * @author alilovepeach
 */
public class AdminRole extends Role {

    public AdminRole() {
    }

    
    @Override
    public JFrame getWorkArea(Library library, UserAccount useraccount) {
        return new AdminJFrame(library, useraccount);
    }
    
}