package model;

import java.util.ArrayList;

public class Offering {

    private int section;
    private Course theCourse;
    private ArrayList<Registration> studentList;

    public void addStudent(Registration r) {
        studentList.add(r);
    }

    public Offering(int section) {

        this.section = section;
        studentList = new ArrayList<>();
    }

    public int getSection() {
        return section;
    }

    public Course getCourse() {
        return theCourse;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setTheCourse(Course theCourse) {
        this.theCourse = theCourse;
    }

    public void validateOffering() throws MinStudentsException {
        if (this.studentList.size() < 8)
            throw new MinStudentsException();
    }

    @Override
    public String toString() {
        return "Section = " + section;
    }
}
