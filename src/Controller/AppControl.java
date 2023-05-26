/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author abokh
 */
public class AppControl {

    public FileAccess fileAccess;
//    private static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
//    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");

    public AppControl() {
        fileAccess = new FileAccess();
    }

    public void addUser(String userName, String password, String email, String Phone) {
        User u = new User(userName, password, email, Phone);
        String str = u.toString() + "\n";
        fileAccess.writeToFile(fileAccess.FILEUSER, str);
    }

    public void addBook(String ID, String bookName, String author, String Quantity) {
        Books u = new Books(ID, bookName, author, Quantity);
        String str = u.toString() + "\n";
        fileAccess.writeToFile(fileAccess.FILEBOOK, str);
    }
    public void addUpcomingBook(String ID, String bookName, String author, String Quantity) {
        UpcomingBook u = new UpcomingBook(ID, bookName, author, Quantity);
        String str = u.toString() + "\n";
        fileAccess.writeToFile(fileAccess.FILEUPCOMINGBOOK, str);
    }

    public void addIssuedBook( String bookID, String studentID, String issueDate, String returnDate, String status) {
        IssuedBook u = new IssuedBook( bookID, studentID, issueDate, returnDate, status);
        String str = u.toString() + "\n";
        fileAccess.writeToFile(fileAccess.FILEISSUEDBOOK, str);

    }

    public void addReturndBook( String bookName, String studentName, String issueDate, String returnDate, String status) {
        ReturnBooks r = new ReturnBooks( bookName, studentName, issueDate, returnDate, status);
        String str = r.toString() + "\n";
        fileAccess.writeToFile(fileAccess.FILERETURNBOOK, str);

    }

    public void addStudent(String ID, String studentName, String course, String Major) {
        Books u = new Books(ID, studentName, course, Major);
        String str = u.toString() + "\n";
        fileAccess.writeToFile(fileAccess.FILESTUDENTS, str);
    }

    public boolean CheckUser(String userName, String password) {
        boolean c = false;
        ArrayList<User> allUsers = fileAccess.readUser();
        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getUserName().equals(userName) || allUsers.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return c;
    }

    public boolean CheckBook(String Name, String author) {
        boolean c = false;
        ArrayList<Books> allBooks = fileAccess.readBooks();
        for (int i = 0; i < allBooks.size(); i++) {
            if (allBooks.get(i).getBookName().equals(Name) || allBooks.get(i).getAuthor().equals(author)) {
                return true;
            }
        }
        return c;
    }

    public boolean CheckBookById(String ID) {
        boolean c = false;
        ArrayList<Books> allBooks = fileAccess.readBooks();
        for (int i = 0; i < allBooks.size(); i++) {
            if (allBooks.get(i).getBookName().equals(ID)) {
                return true;
            }
        }
        return c;
    }

    public boolean CheckStudnetById(String ID) {
        boolean c = false;
        ArrayList<Students> allStudents = fileAccess.readStudents();
        for (int i = 0; i < allStudents.size(); i++) {
            if (!allStudents.get(i).getStudentID().equals(ID)) {
                return true;
            }
        }
        return c;
    }

    public boolean CheckStudent(String Name, String Id) {
        boolean c = false;
        ArrayList<Students> students = fileAccess.readStudents();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentName().equals(Name) || students.get(i).getStudentID().equals(Id)) {
                return true;
            }
        }
        return c;
    }

    public String addBookById(String Id) {
        ArrayList<Books> books = fileAccess.readBooks();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(Id)) {
                return books.get(i).getBookName();
            }
        }

        return "error";
    }

    public String[][] getBooksInfo(int rowCount) {
        String[][] data = new String[rowCount][4];
        String[] bookInfo;
        String line = "";
        int row = 0;
        try {
            FileInputStream fs = new FileInputStream(fileAccess.FILEBOOK);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                bookInfo = line.split("\t");
                data[row][0] = bookInfo[0];
                data[row][1] = bookInfo[1];
                data[row][2] = bookInfo[2];
                data[row][3] = bookInfo[3];
                row++;
            }
            in.close();
        } catch (IOException ioe) {
        }
        return data;
    }

    public int getBooksCount() {
        return fileAccess.readBooks().size();
    }

    public String[][] getBooksdata() {
        int row = this.getBooksCount();
        String[][] data = getBooksInfo(row);
        return data;
    }

    public String[][] getStudentsInfo(int rowCount) {
        String[][] data = new String[rowCount][4];
        String[] studentsInfo;
        String line = "";
        int row = 0;
        try {
            FileInputStream fs = new FileInputStream(fileAccess.FILESTUDENTS);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                studentsInfo = line.split("\t");
                data[row][0] = studentsInfo[0];
                data[row][1] = studentsInfo[1];
                data[row][2] = studentsInfo[2];
                data[row][3] = studentsInfo[3];
                row++;
            }
            in.close();
        } catch (IOException ioe) {
        }
        return data;
    }

    public int getStudentsCount() {
        return fileAccess.readStudents().size();
    }

    public String[][] getStudentdata() {
        int row = this.getStudentsCount();
        String[][] data = getStudentsInfo(row);
        return data;
    }

    public String[][] getIssuedBooksInfo(int rowCount) {
        String[][] data = new String[rowCount][5];
        String[] issuedBookInfo;
        String line = "";
        int row = 0;
        try {
            FileInputStream fs = new FileInputStream(fileAccess.FILEISSUEDBOOK);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                issuedBookInfo = line.split("\t");
                data[row][0] = issuedBookInfo[0];
                data[row][1] = issuedBookInfo[1];
                data[row][2] = issuedBookInfo[2];
                data[row][3] = issuedBookInfo[3];
                data[row][4] = issuedBookInfo[4];
                row++;
            }
            in.close();
        } catch (IOException ioe) {
        }
        return data;
    }

  

    public int getIssuedBooksCount() {
        return fileAccess.readIssuedBooks().size();
    }

    public String[][] getIssuedBooksdata() {
        int row = this.getIssuedBooksCount();
        String[][] data = getIssuedBooksInfo(row);
        return data;
    }

    public String[][] getUpComingBooksInfo(int rowCount) {
        String[][] data = new String[rowCount][5];
        String[] issuedBookInfo;
        String line = "";
        int row = 0;
        try {
            FileInputStream fs = new FileInputStream(fileAccess.FILEUPCOMINGBOOK);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                issuedBookInfo = line.split("\t");
                data[row][0] = issuedBookInfo[0];
                data[row][1] = issuedBookInfo[1];
                data[row][2] = issuedBookInfo[2];
                data[row][3] = issuedBookInfo[3];
                row++;
            }
            in.close();
        } catch (IOException ioe) {
        }
        return data;
    }

  

    public int getUPBooksCount() {
        return fileAccess.readUpcomigBooks().size();
    }

    public String[][] getUpBooksdata() {
        int row = this.getUPBooksCount();
        String[][] data = getUpComingBooksInfo(row);
        return data;
    }

}
