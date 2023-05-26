/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author abokh
 */
public class FileAccess {

    public static final String FILEUSER = "user.txt";
    public static final String FILESTUDENTS = "Students.txt";
    public static final String FILEBOOK = "Books.txt";
    public static final String FILEISSUEDBOOK = "issuedBooks.txt";
    public static final String FILERETURNBOOK = "ReturnBooks.txt";
    public static final String FILEUPCOMINGBOOK = "upcomingBooks.txt";
    

    public void writeToFile(String filename, String str) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(str);
            fw.close();
        } catch (IOException ioe) {
        }
    }

    public ArrayList<User> readUser() {
        ArrayList<User> User = new ArrayList();
        String line;
        String[] userInfo;
        try {
            FileInputStream fs = new FileInputStream(FILEUSER);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                userInfo = line.split("\t");
                User u = new User(userInfo[0], userInfo[1], userInfo[2], userInfo[3]);
                User.add(u);
            }
            in.close();
        } catch (IOException e) {
        }
        return User;
    }

    public ArrayList<Students> readStudents() {
        ArrayList<Students> students = new ArrayList();
        String line;
        String[] studentsInfo;
        try {
            FileInputStream fs = new FileInputStream(FILESTUDENTS);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                studentsInfo = line.split("\t");
                Students s = new Students(studentsInfo[0], studentsInfo[1], studentsInfo[2], studentsInfo[3]);
                students.add(s);
            }
            in.close();
        } catch (IOException e) {
        }
        return students;
    }

    public ArrayList<Books> readBooks() {
        ArrayList<Books> books = new ArrayList();
        String line;
        String[] booksInfo;
        try {
            FileInputStream fs = new FileInputStream(FILEBOOK);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                booksInfo = line.split("\t");
                Books b = new Books(booksInfo[0], booksInfo[1], booksInfo[2], booksInfo[3]);
                books.add(b);
            }
            in.close();
        } catch (IOException e) {
        }
        return books;
    }

    public ArrayList<UpcomingBook> readUpcomigBooks() {
        ArrayList<UpcomingBook> books = new ArrayList();
        String line;
        String[] booksInfo;
        try {
            FileInputStream fs = new FileInputStream(FILEUPCOMINGBOOK);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                booksInfo = line.split("\t");
                UpcomingBook b = new UpcomingBook(booksInfo[0], booksInfo[1], booksInfo[2], booksInfo[3]);
                books.add(b);
            }
            in.close();
        } catch (IOException e) {
        }
        return books;
    }

    public ArrayList<IssuedBook> readIssuedBooks() {
        ArrayList<IssuedBook> issuedBooks = new ArrayList();
        String line;
        String[] issuedBooksInfo;
        try {
            FileInputStream fs = new FileInputStream(FILEISSUEDBOOK);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                issuedBooksInfo = line.split("\t");
                IssuedBook iB = new IssuedBook( issuedBooksInfo[0], issuedBooksInfo[1],
                        issuedBooksInfo[2], issuedBooksInfo[3], issuedBooksInfo[4]);
                issuedBooks.add(iB);
            }
            in.close();
        } catch (IOException e) {
        }
        return issuedBooks;
    }

    public ArrayList<ReturnBooks> readReturedBooks() {
        ArrayList<ReturnBooks> issuedBooks = new ArrayList();
        String line;
        String[] ReturnBooksInfo;
        try {
            FileInputStream fs = new FileInputStream(FILERETURNBOOK);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) {
                line = in.readLine();
                ReturnBooksInfo = line.split("\t");
                ReturnBooks rb = new ReturnBooks( ReturnBooksInfo[0], ReturnBooksInfo[1],
                        ReturnBooksInfo[2], ReturnBooksInfo[3], ReturnBooksInfo[4]+"\n");
                issuedBooks.add(rb);
            }
            in.close();
        } catch (IOException e) {
        }
        return issuedBooks;
    }
    public void clearFile(String filename) {
        try {
            FileWriter fw = new FileWriter(filename, false);
            fw.close();
        } catch (IOException ioe) {
        }
    }

    public void removeRecords(String filepath, String removeItem, int positionOfItem, String dilemeter) {

        int position = positionOfItem - 1;
        String tempfile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempfile);
        String currentLine;
        String data[];

        try {


            FileWriter fileWriter = new FileWriter(tempfile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bufferedWriter);
            FileInputStream fs = new FileInputStream(filepath);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) 
            {
                currentLine =  in.readLine();
                data = currentLine.split("\t");
                if (!(data[position].equalsIgnoreCase(removeItem))) {
                    pw.println(currentLine);
              
                }
            }
            pw.flush();
            pw.close();
            in.close();
            bufferedWriter.close();
            fileWriter.close();
            oldFile.delete();
            File du = new File(filepath);
            newFile.renameTo(du);

        } catch (Exception e) {
          e.printStackTrace();
        }
    }
    public void editRecordsBooks (String filepath, String editTearm, int positionOfItem, String newId, String newName, String newlevel, String newMajor) {

        int position = positionOfItem - 1;
        String tempfile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempfile);
        String currentLine;
        String data[];

        try {


            FileWriter fileWriter = new FileWriter(tempfile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bufferedWriter);
            FileInputStream fs = new FileInputStream(filepath);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) 
            {
                currentLine =  in.readLine();
                data = currentLine.split("\t");
                if (!(data[position].equalsIgnoreCase(editTearm))) {
                    pw.println(currentLine);
                }
                else{
                     pw.println(newId + "\t" + newName + "\t" + newlevel + "\t" + newMajor); 
                }
            }
            pw.flush();
            pw.close();
            in.close();
            bufferedWriter.close();
            fileWriter.close();
            oldFile.delete();
            File du = new File(filepath);
            newFile.renameTo(du);

        } catch (Exception e) {
          e.printStackTrace();
        }
    }
    
    public void editBooksQuantity (String filepath, String editTearm, int positionOfItem, String id, String name, String author, int quantity) {

        int position = positionOfItem - 1;
        String tempfile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempfile);
        String currentLine;
        String data[];

        try {


            FileWriter fileWriter = new FileWriter(tempfile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bufferedWriter);
            FileInputStream fs = new FileInputStream(filepath);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) 
            {
                currentLine =  in.readLine();
                data = currentLine.split("\t");
                if (!(data[position].equalsIgnoreCase(editTearm))) {
                    pw.println(currentLine);
                }
                else{
                     pw.println(id + "\t" + name + "\t" + author + "\t" + quantity); 
                }
            }
            pw.flush();
            pw.close();
            in.close();
            bufferedWriter.close();
            fileWriter.close();
            oldFile.delete();
            File du = new File(filepath);
            newFile.renameTo(du);

        } catch (Exception e) {
          e.printStackTrace();
        }
    }
    public void editRecordsIssuedBooks (String filepath, String editTearm,int positionOfItem, String bookId, String studentId, String Issueddate, String ReturnDate) {

        int position1 = positionOfItem - 1;
        String tempfile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempfile);
        String currentLine;
        String data[];

        try {


            FileWriter fileWriter = new FileWriter(tempfile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bufferedWriter);
            FileInputStream fs = new FileInputStream(filepath);
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while (in.ready()) 
            {
                currentLine =  in.readLine();
                data = currentLine.split("\t");
                if (!(data[position1].equalsIgnoreCase(editTearm))){
                    pw.println(currentLine);
                }
                else{
                     pw.println(bookId + "\t" + studentId+ "\t" + Issueddate + "\t" + ReturnDate + "\t" + "Returned"); 
                }
            }
            pw.flush();
            pw.close();
            in.close();
            bufferedWriter.close();
            fileWriter.close();
            oldFile.delete();
            File du = new File(filepath);
            newFile.renameTo(du);

        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
