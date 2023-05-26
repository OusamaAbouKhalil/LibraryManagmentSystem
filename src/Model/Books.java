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
public class Books {

    private String id;
    private String bookName;
    private String author;
    private String Quantity;
    private static int numberOfBooks = 0;

    public Books(String id ,String bookName, String author, String Quantity) {
        this.bookName = bookName;
        this.author = author;
        this.Quantity = Quantity;
        this.id = id;
        numberOfBooks++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public static int getNumBook() {
        return numberOfBooks;
    }

    public static void setNumBookID(int bookID) {
        Books.numberOfBooks = bookID;
    }

    @Override
    public String toString() {
        return this.id + "\t" + this.bookName + "\t" + this.author + "\t" + this.Quantity;
    }

    }
