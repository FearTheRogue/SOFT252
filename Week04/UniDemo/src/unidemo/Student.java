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
public class Student extends UniPeople {
    
    public Student(int id, String name){
        this.m_id = id;
        this.m_name = name;
    }
    
    public void attendClass(){
        System.out.println(this.m_name + " is attending " + 
                this.m_course.getCode() + " in room " + this.m_course.getM_Room());
    }
    
    public void doCourseWork(){
        if(this.m_course.getM_Coursework() != null && 
                !this.m_course.getM_Coursework().isEmpty()){
            System.out.println(this.m_name + " is doing coursework " 
                    + this.m_course.getM_Coursework());
        } else {
            System.out.println("No coursework set!");
        }
    }
}
