package viewController;

import model.*;

import java.util.ArrayList;

public class DataLoader {

    //Helper method
    public static ArrayList<Course> loadCoursesFromDataBase (){
        //Simulating a database!
        Course c1 = new Course ("ENSF", 609);
        Course c2 = new Course ("ENSF", 610);
        Course c3 = new Course ("ENSF", 611);
        Course c4 = new Course ("ENSF", 608);
        Course c5 = new Course ("ENSF", 604);
        Course c6 = new Course ("ENSF", 592);
        Course c7 = new Course ("ENSF", 617);
        Course c8 = new Course ("ENSF", 614);



        //Will have to come back later here!!
        // ArrayList<Offering> tempOfferingList = new ArrayList<Offering>();
        // tempOfferingList.add(new Offering(1));
        // tempOfferingList.add(new Offering(2));
        // System.out.println(tempOfferingList.get(0));

        ArrayList <Course> tempCourseList = new ArrayList<>();
        tempCourseList.add(c1);
        // tempCourseList.get(0).setOfferingList(tempOfferingList);
        tempCourseList.add(c2);
        tempCourseList.add(c3);
        tempCourseList.add(c4);
        tempCourseList.add(c5);
        tempCourseList.add(c6);
        tempCourseList.add(c7);
        tempCourseList.add(c8);

        return tempCourseList;
    }

    public static ArrayList<Student> loadStudentsFromDatabase() {

        Student s1 = new Student("John Doe",100);
        Student s2 = new Student("James Reese", 101);
        Student s3 = new Student("Alexandar Arnold", 102);
        Student s4 = new Student("Zlatan Ibrahimavic", 103);
        Student s5 = new Student("Ben Yedder", 104);
        Student s6 = new Student("Mo Salah", 105);
        Student s7 = new Student("Paolo Dybala", 106);
        Student s8 = new Student("Tony Kroos", 107);
        Student s9 = new Student("Raheem Sterling", 108);

        ArrayList <Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);

        return students;

    }
}
