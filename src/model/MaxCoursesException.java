package model;

public class MaxCoursesException extends Exception {
    public MaxCoursesException(){
        super("Max courses limit reached. Cannot register in more than 6 courses.");
    }
}
