package model;

public class Registration {

    private Offering theOffering;
    private Student theStudent;

    private char theGrade;

    public void register(Student theStudent, Offering theOffering) {
        try {
            this.theStudent = theStudent;
            this.theOffering = theOffering;
            theOffering.addStudent(this);
            theStudent.addCourse(this);
        } catch (MaxCoursesException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setTheGrade(char theGrade) {
        this.theGrade = theGrade;
    }

    public char getTheGrade() {
        return theGrade;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "theGrade=" + theGrade +
                "theStudent=" + theStudent +
                "theOffering=" + theOffering +
                '}';
    }
}
