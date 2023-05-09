package com.example.adminmodule;

public class tableModelmanager {
    private Integer M_id;
    public String M_name;
    public String M_dob;
    private char M_gender;
    private String M_password;
    private String M_address;
    private double M_salary;
    private String M_phone;
    public tableModelmanager(Integer id, String name, String dob, String gender, String password, String address, double salary, String phone ){

        this.M_id=id;
        this.M_name=name;
        this.M_dob=dob;
        this.M_gender=gender;
        this.M_password=password;
        this.M_salary=salary;
        this.M_address=address;
        this.M_phone=phone;

    }
    public void setM_id(Integer m_id) {
        M_id = m_id;
    }
    public void setM_dob(String m_dob) {
        M_dob = m_dob;
    }
    public void setM_address(String m_address) {
        M_address = m_address;
    }
    public void setM_gender(char m_gender) {
        M_gender = m_gender;
    }
    public void setM_name(String m_name) {
        M_name = m_name;
    }
    public void setM_password(String m_password) {
        M_password = m_password;
    }
    public void setM_phone(String m_phone) {
        M_phone = m_phone;
    }
    public void setM_salary(double m_salary) {
        M_salary = m_salary;
    }
    public Integer getM_id() {
        return M_id;
    }
    public char getM_gender() {
        return M_gender;
    }
    public double getM_salary() {
        return M_salary;
    }
    public String getM_address() {
        return M_address;
    }
    public String getM_dob() {
        return M_dob;
    }
    public String getM_name() {
        return M_name;
    }
    public String getM_password() {
        return M_password;
    }
    public String getM_phone() {
        return M_phone;
    }
}

