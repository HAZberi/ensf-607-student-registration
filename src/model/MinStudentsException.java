package model;

public class MinStudentsException extends Exception {
    public MinStudentsException() {
        super("Unable to initiate course offering. Must have at least 8 students.");
    }
}
