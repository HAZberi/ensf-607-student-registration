package viewController;

import model.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CourseCat cat = new CourseCat(DataLoader.loadCoursesFromDataBase());

        System.out.println(cat);

        Student s1 = new Student ("Jane", 1);
        Student s2 = new Student ("Sam", 2);

        s1.registerForCourse(cat,"ENSF", 609, 1);

        System.out.println(s1);

      //  ArrayList<Course> tempCourses = cat.getCourseList();

      //  tempCourses.get(1).setCourseName("CHEM");

      //  System.out.println(cat);

    }

}