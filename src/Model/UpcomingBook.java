/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author abokh
 */
public class UpcomingBook {
    
    private String Name ;
    private String author ;
    private String date ;
    private String Quantity ;

    public UpcomingBook(String Name, String author, String date, String Quantity) {
        this.Name = Name;
        this.author = author;
        this.date = date;
        this.Quantity = Quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return  Name + "\t" + author + "\t" + date + "\t" + Quantity ;
    }
    
}
