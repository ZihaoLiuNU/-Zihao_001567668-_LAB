/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Role.UserAccountDirectory;
import Author.AuthorDirectory;
import Book.BookCatalog;
import Customer.CustomerDirectory;
import Genre.GenreDirectory;
import Librarian.Librarian;
import Role.UserAccount;

/**
 *
 * @author alilovepeach
 */
public class Library {
    UserAccountDirectory uad;
    BookCatalog bc;
    AuthorDirectory ad;
    CustomerDirectory cd;
    GenreDirectory gd;
    Librarian librarian;

    public Library() {
        this.uad = new UserAccountDirectory();
        this.bc = new BookCatalog();
        this.ad = new AuthorDirectory();
        this.cd = new CustomerDirectory();
        this.gd = new GenreDirectory();
        this.librarian = new Librarian();
        
        UserAccount admin = this.uad.createUserAccount("1", "1", "admin");
        UserAccount librarian = this.uad.createUserAccount("1", "1", "librarian");
 
    }
    
    public static Library getLibraryInstance() {
        
        return new Library();
    }
    

    public UserAccountDirectory getUad() {
        return uad;
    }

    public void setUad(UserAccountDirectory uad) {
        this.uad = uad;
    }

    public BookCatalog getBc() {
        return bc;
    }

    public void setBc(BookCatalog bc) {
        this.bc = bc;
    }

    public AuthorDirectory getAd() {
        return ad;
    }

    public void setAd(AuthorDirectory ad) {
        this.ad = ad;
    }

    public CustomerDirectory getCd() {
        return cd;
    }

    public void setCd(CustomerDirectory cd) {
        this.cd = cd;
    }

    public GenreDirectory getGd() {
        return gd;
    }

    public void setGd(GenreDirectory gd) {
        this.gd = gd;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    
    
}
