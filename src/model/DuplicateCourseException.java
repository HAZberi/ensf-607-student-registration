package model;

public class DuplicateCourseException extends Exception{
    public DuplicateCourseException(){
        super("Course already registered. Please Register a different course.");
    }
}
