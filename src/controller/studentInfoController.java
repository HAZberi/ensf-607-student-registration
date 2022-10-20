package controller;


import model.*;
import view.*;

public class StudentInfoController extends AppController{
    
    private StudentInfo view;

    public StudentInfoController()
    {
        this.view = new StudentInfo();

        view.quit.addActionListener(e -> quit(this.view));
        view.mainMenu.addActionListener(e -> mainMenu(this.view));
        view.newStudentSubmit.addActionListener(e -> newStudentCreate());
        view.existingStudentSubmit.addActionListener(e -> setExistingStudent());

    }

    public void newStudentCreate(){
        String studentName = view.getStudentName();
        int studentId = view.getStudentId();
        Student newStudent = new Student(studentName, studentId);
        addStudent(newStudent);
        setCurrentStudent(newStudent);
        view.setVisible(false);
        new MainViewController();
    }

    public void setExistingStudent(){
        int studentId = view.getExistingStudentId();
        Student existingStudent = getStudent(studentId);
        if(existingStudent != null){
            setCurrentStudent(existingStudent);
            view.setVisible(false);
            new MainViewController();
            return;
        }

        view.setMessage("Cannot find Student with id: " + studentId);
    }

}
