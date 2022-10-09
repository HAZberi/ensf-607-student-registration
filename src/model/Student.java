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

    public void registerForCourse(CourseCat cat, String courseName, int courseId, int secNumber) {

        Course myCourse = cat.searchCat(courseName, courseId);

        if (myCourse == null)
            return;
        // if the course exists, then we can look at the section
        Offering theOffering = myCourse.getOffering(secNumber);
        Registration reg = new Registration();
        reg.register(this, theOffering);
    }

    public void removeCourse(int i) {
        // Find course in the courselist
        this.courseList.get(i);
    }

    public void printCourseList() {
        String str = "_".repeat(20) + "\n" + " ".repeat(4) + "Course List " + " ".repeat(4) + "\n" + "_".repeat(20)
                + "\n";

        for (Registration r : this.courseList) {
            str = str + r.getCourseInfo() + "\n";
        }

        str = str + "_".repeat(20) + "\n";

        System.out.println(str);
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
