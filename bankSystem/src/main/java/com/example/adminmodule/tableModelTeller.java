package com.example.adminmodule;

public class tableModelTeller {
    private Integer T_id;
    private String T_name;
    private String T_dob;
    private char T_gender;
    private String T_password;
    private String T_address;
    private double T_salary;
    private String T_phone;
    public tableModelTeller(Integer id, String name, String dob, char gender, String password, String address, double salary, String phone ){

        this.T_id=id;
        this.T_name=name;
        this.T_dob=dob;
        this.T_gender=gender;
        this.T_password=password;
        this.T_salary=salary;
        this.T_address=address;
        this.T_phone=phone;

    }
    public void setT_id(Integer t_id) {
        T_id = t_id;
    }
    public Integer getT_id() {
        return T_id;
    }
    public void setT_name(String t_name) {
        T_name = t_name;
    }
    public String getT_name() {
        return T_name;
    }
    public void setT_dob(String t_dob) {
        T_dob = t_dob;
    }
    public String getT_dob() {
        return T_dob;
    }
    public void setT_gender(char t_gender) {
        T_gender = t_gender;
    }
    public char getT_gender() {
        return T_gender;
    }
    public void setT_password(String t_password) {
        T_password = t_password;
    }
    public String getT_password() {
        return T_password;
    }
    public void setT_phone(String t_phone) {
        T_phone = t_phone;
    }
    public String getT_phone() {
        return T_phone;
    }
    public void setT_salary(double t_salary) {
        T_salary = t_salary;
    }
    public double getT_salary() {
        return T_salary;
    }
    public void setT_address(String t_address) {
        T_address = t_address;
    }
    public String getT_address() {
        return T_address;
    }
}
