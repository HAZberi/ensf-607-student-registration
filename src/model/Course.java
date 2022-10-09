package model;

import java.util.ArrayList;
import java.util.Objects;

public class Course {

    private String courseName;
    private int courseId;
    private ArrayList<Course> preReqs;
    private ArrayList<Offering> offeringList;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.offeringList = new ArrayList<Offering>();
        this.preReqs = new ArrayList<Course>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setPreReqs(ArrayList<Course> preReqs) {
        // this.preReqs = preReqs;
        for (Course c : preReqs)
            this.preReqs.add(c);
    }

    public Offering getOffering(int i) {
        return offeringList.get(i - 1);
    }

    public ArrayList<Offering> getOfferingList() {
        return this.offeringList;
    }

    public void setOfferingList(ArrayList<Offering> offeringList) {
        for (Offering offering : offeringList) {
            offering.setTheCourse(this);
            this.offeringList.add(offering);
        }
    }

    public void validateOffering() {
        for (Offering offering : offeringList) {
            try {
                offering.validate();
                System.out.println(courseName + "-" + courseId + "-" + offering.getSection() + ": "
                        + "Course Offering Intiation Successful");
            } catch (MinStudentsException e) {
                System.out.println(courseName + "-" + courseId + "-" + offering.getSection() + ": " + e.getMessage());
            }
        }
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
    public boolean equals(Object course) {

        if (course == this) {
            return true;
        }

        if (!(course instanceof Course)) {
            return false;
        }

        // type casting
        Course compareCourse = (Course) course;

        return this.courseId == compareCourse.courseId && this.courseName == compareCourse.courseName;
    }

    private String stringifyOfferingList() {
        String str = "[";
        for (Offering of : offeringList) {
            str = str + "Section=" + of.getSection() + ", ";
        }
        str = str + "]";
        return str;
    }

    @Override
    public String toString() {
        return "Course Name = '" + courseName + '\'' +
                ", Course ID = " + courseId +
                ", Prerequisites = " + preReqs +
                ", Offerring List = " + stringifyOfferingList() + "\n";
    }
}
