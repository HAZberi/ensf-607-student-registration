package model;

import java.util.ArrayList;

public class CourseCat {

    ArrayList <Course> courseList;

    public CourseCat (ArrayList <Course> courseList){
        this.courseList = courseList;
    }
    public ArrayList <Course> getCourseList (){
        return courseList;
    }

    public Course searchCat (String courseName, int courseId) {
        for (Course c: courseList) {
            if (c.getCourseName().equals(courseName) &&
                    c.getCourseId() == courseId) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {

        String str = "\n" + "-".repeat(90) + "\n";

        str = str + " ".repeat(38) + "Course Catalog" + "\n" + "-".repeat(90) + "\n";

        int i = 1;

        for(Course c: this.courseList){
            str = str + i + ": " + c.toString();
            i++;
        }

        str += "-".repeat(90);
        return str;
    }
}
