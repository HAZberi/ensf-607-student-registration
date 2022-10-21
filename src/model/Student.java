package model;

import java.util.ArrayList;

public class Student {

    private String name;
    private int id;

    private ArrayList<Registration> courseList;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        courseList = new ArrayList<>();
    }

    public void addCourse(Registration reg) throws MaxCoursesException, DuplicateCourseException {
        if (courseList.size() + 1 > 6) {
            throw new MaxCoursesException();
        }

        for (Registration r : this.courseList) {
            if (r.getOffering().getCourse().getCourseId() == reg.getOffering().getCourse().getCourseId()) {
                throw new DuplicateCourseException();
            }
        }

        courseList.add(reg);
        System.out.println("Successfully added the course.");

    }

    public ArrayList<Registration> getCourseList() {
        return this.courseList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String registerForCourse(CourseCat cat, String courseName, int courseId, int secNumber) {

        Course myCourse = cat.searchCat(courseName, courseId);

        if (myCourse == null)
            return "";
        // if the course exists, then we can look at the section
        Offering theOffering = myCourse.getOffering(secNumber);
        Registration reg = new Registration();
        return reg.register(this, theOffering);
    }

    public String removeCourse(Course course) {
        for (Registration myReg : this.courseList) {
            if (myReg.getOffering().getCourse().equals(course)) {
                myReg.getOffering().removeStudent(myReg);
                this.courseList.remove(myReg);
                System.out.println("Course Successfully Deleted.");

                return course.getCourseName() + "-" + course.getCourseId() + " successfully Dropped.";
            }
        }

        System.out.println("No Registrations found for " + course.getCourseName() + "-" + course.getCourseId());
        return "No Registrations found for " + course.getCourseName() + "-" + course.getCourseId();
    }

    public String printCourseList() {
        String str = "_".repeat(20) + "\n" + " ".repeat(4) + "Course List " + " ".repeat(4) + "\n" + "_".repeat(20)
                + "\n";

        for (Registration r : this.courseList) {
            str = str + r.getCourseInfo() + "\n";
        }

        str = str + "_".repeat(20) + "\n";
        System.out.println(str);
        return str;
    }

    /**
     * 
     * equals check for equality with other Course object
     * 
     * @param
     * object        of Course class
     * 
     * @return
     *         true or false of type boolean
     */
    @Override
    public boolean equals(Object student) {

        if (student == this) {
            return true;
        }

        if (!(student instanceof Student)) {
            return false;
        }

        // type casting
        Student compareStudent = (Student) student;

        return this.id == compareStudent.id && this.name == compareStudent.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", courseList=" + courseList +
                '}';
    }
}
