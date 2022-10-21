package model;

public class Registration {

    private Offering theOffering;
    private Student theStudent;

    private char theGrade;

    public String register(Student theStudent, Offering theOffering) {
        try {
            this.theStudent = theStudent;
            this.theOffering = theOffering;
            this.theStudent.addCourse(this);
            this.theOffering.addStudent(this);
            return "Success";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }

    public void setTheGrade(char theGrade) {
        this.theGrade = theGrade;
    }

    public char getTheGrade() {
        return theGrade;
    }

    public String getCourseInfo(){
        return theOffering.getCourse().getCourseName() + "-" + theOffering.getCourse().getCourseId() + "-" + theOffering.getSection();
    }

    public Offering getOffering(){
        return this.theOffering;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "StudentID=" + theStudent.getId() +
                ", Course=" + theOffering.getCourse().getCourseName() + "-" + theOffering.getCourse().getCourseId() +
                ", Section=" + theOffering.getSection() +
                '}';
    }
}
