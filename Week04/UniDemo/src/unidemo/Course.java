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
       private String m_courseCode;
       private Lecturer m_lecturer;
       private String m_coursework;
       private String m_room;

    public String getM_courseCode() {
        return m_courseCode;
    }

    public void setM_courseCode(String m_courseCode) {
        this.m_courseCode = m_courseCode;
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

    public void setM_Coursework(String m_Coursework) {
        this.m_coursework = m_Coursework;
    }

    public String getM_Room() {
        return m_room;
    }

    public void setM_Room(String m_Room) {
        this.m_room = m_Room;
    }      
}
