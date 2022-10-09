package model;

public class Registration {

    private Offering theOffering;
    private Student theStudent;

    private char theGrade;

    public void register(Student theStudent, Offering theOffering) {
        try {
            this.theStudent = theStudent;
            this.theOffering = theOffering;
            this.theStudent.addCourse(this);
            this.theOffering.addStudent(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
