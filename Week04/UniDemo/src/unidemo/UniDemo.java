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
public class UniDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Lecturer John = new Lecturer(23, "John Smith");
        Student James = new Student(532632, "James Bradley");
        Course OOP = new Course("DLB241", "OOP101");
        
        Admin.getDetails(James);
        Admin.assignCourse(John, OOP);
        Admin.assignCourse(James, OOP);
        
        John.teach();
        
        James.attendClass();
        James.doCourseWork();
        John.setCoursework("CW1: Basic coding skills");
        James.doCourseWork();
        Admin.getDetails(John);
    }
    
}
