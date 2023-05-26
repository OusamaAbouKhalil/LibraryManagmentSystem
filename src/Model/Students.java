
package Model;

/**
 *
 * @author abokh
 */
public class Students {
    private String StudentID;
    private String StudentName;
    private String StudentCourse;
    private String StudentMajor;

    public Students(String StudentID, String StudentName, String StudentCourse, String StudentMajor) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.StudentCourse = StudentCourse;
        this.StudentMajor = StudentMajor;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentCourse() {
        return StudentCourse;
    }

    public void setStudentCourse(String StudentCourse) {
        this.StudentCourse = StudentCourse;
    }

    public String getStudentMajor() {
        return StudentMajor;
    }

    public void setStudentMajor(String StudentMajor) {
        this.StudentMajor = StudentMajor;
    }

    @Override
    public String toString() {
        return  this.StudentID + "\t" + this.StudentName + "\t" + this.StudentCourse + "\t" + this.StudentMajor ;
    }
    
}
