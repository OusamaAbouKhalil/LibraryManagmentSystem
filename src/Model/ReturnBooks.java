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
public class ReturnBooks {
      private String bookName;
    private String studentName;
    private String issueDate;
    private String returnDate;
    private String status ;

    public ReturnBooks(String bookName, String studentName, String issueDate, String returnDate, String status) {
        this.bookName = bookName;
        this.studentName = studentName;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.bookName+ "\t" + this.studentName + "\t" + this.issueDate + "\t" + this.returnDate + "\t" + this.status;
    }
    
    
}
