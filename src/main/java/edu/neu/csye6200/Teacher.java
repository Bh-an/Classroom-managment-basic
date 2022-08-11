package edu.neu.csye6200;

import java.util.*;

public class Teacher extends AbstractPerson {

    private  String Subject;
    private  String Homeroom;
    private  String Level;
    private  int Salary;

    public Teacher(){
        super();
    }

    public Teacher(int id, String name, int age, String email, String classroom, String subject, String homeroom, String level, int salary) {
        super(id, name, age, email, classroom);
        Subject = subject;
        Homeroom = homeroom;
        Level = level;
        Salary = salary;
    }

    public Vector<Student> showStudents(){

        Vector<Student> temp = new Vector<>();
        for(Student student:School.getStudents()){

            if ((student.getTeacher()).getName()==this.getName()){
                temp.add(student);

            }
        }

        return temp;
    }
}
