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
public abstract class UniPeople {
    protected int m_id;
    protected Course m_course;
    protected String m_name;

    public int getM_id() {
        return m_id;
    }

    public Course getM_course() {
        return m_course;
    }

    public void setM_course(Course m_course) {
        this.m_course = m_course;
    }

    public String getM_name() {
        return m_name;
    }
}
