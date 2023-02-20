/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Library.Library;
import javax.swing.JFrame;

/**
 *
 * @author alilovepeach
 */
public abstract class Role {
        static String[] roles = {"admin", "customer", "librarian" };

    public static String[] getRoles() {
        return roles;
    }

    public abstract JFrame getWorkArea(Library library, UserAccount useraccount);
}
