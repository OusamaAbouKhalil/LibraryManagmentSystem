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
public class IssuedBook {

    private String bookId;
    private String studentId;
    private String issueDate;
    private String returnDate;
    private String status ;

    public IssuedBook( String bookId, String studentId, String issueDate, String returnDate,String status) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.status = "pending";
    }


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookId;
    }

    public void setBookName(String bookName) {
        this.bookId = bookName;
    }

    public String getStudentName() {
        return studentId;
    }

    public void setStudentName(String StudentName) {
        this.studentId = StudentName;
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

    public void setStatus(String Status) {
        this.status = Status;
    }

    @Override
    public String toString() {
        return  this.bookId+ "\t" + this.studentId + "\t" + this.issueDate + "\t" + this.returnDate + "\t" + this.status;
    }

}
