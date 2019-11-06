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
public class Course {
       private String m_code;
       private Lecturer m_lecturer;
       private String m_coursework;
       private String m_room;

    public Course(String room, String code){
        this.m_room = room;
        this.m_code = code;
    }   
       
    public Lecturer getLecturer(){
        return m_lecturer;
    }
    
    public void setLecturer(Lecturer lecturer){
        this.m_lecturer = lecturer;
    }
    
    public String getCode() {
        return m_code;
    }

    public void setCode(String m_code) {
        this.m_code = m_code;
    }

    public Lecturer getM_Lecturer() {
        return m_lecturer;
    }

    public void setM_Lecturer(Lecturer m_Lecturer) {
        this.m_lecturer = m_Lecturer;
    }

    public String getM_Coursework() {
        return m_coursework;
    }

    public void setM_Coursework(String m_coursework) {
        this.m_coursework = m_coursework;
    }

    public String getM_Room() {
        return m_room;
    }

    public void setM_Room(String m_Room) {
        this.m_room = m_Room;
    }      
}
