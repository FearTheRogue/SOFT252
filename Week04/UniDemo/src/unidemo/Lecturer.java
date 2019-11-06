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
public class Lecturer extends UniPeople implements ITeach{
    
    public Lecturer(int id, String name){
        this.m_id = id;
        this.m_name = name;
    }
    
    @Override
    public void teach(){
        
    }

    @Override
    public void setCoursework(String coursework) {
        this.m_course.setM_Coursework(coursework);    
    }
}
