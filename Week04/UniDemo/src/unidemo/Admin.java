/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author James
 */
public class Admin {
    
    public static void assignCourse(Lecturer lecturer, Course course){
        lecturer.setM_course(course);
        course.setLecturer(lecturer);
    }
    
    public static void assignCourse(Student student, Course course){
     student.setM_course(course);   
    }
    
    public static void getDetails(UniPeople p){
        System.out.println("Name: " + p.getM_name());
        System.out.println("ID: " + p.getM_id());
    
        if(p.getM_course() != null) {
            System.out.println("Course: " + p.getM_course().getCode());
        } else {
            System.out.println("No Course assigned");
        }
    }
}
