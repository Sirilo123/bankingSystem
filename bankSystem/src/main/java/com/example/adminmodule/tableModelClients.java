package com.example.adminmodule;

public class tableModelClients {
    private Integer C_id;
    private String C_acc_Name;
    private int C_acc_No;
    private String C_dob;
    private char C_gender;
    private String C_password;
    private String C_address;
    private double C_balance;
    private String C_phone;
    public tableModelClients(Integer id, String name,int acc_No,String dob,char gender, String password, String address, double balance,String phone ){
        this.C_id=id;
        this.C_acc_Name=name;
        this.C_acc_No=acc_No;
        this.C_dob=dob;
        this.C_gender=gender;
        this.C_password=password;
        this.C_address=address;
        this.C_balance=balance;
        this.C_phone=phone;
    }
    public void setC_id(Integer c_Id) {
        C_id = c_Id;
    }
    public void setC_acc_Name(String c_acc_Name) {
        C_acc_Name = c_acc_Name;
    }
    public void setC_acc_No(int c_acc_No) {
        C_acc_No = c_acc_No;
    }
    public void setC_dob(String c_dob) {
        C_dob = c_dob;
    }
    public void setC_address(String c_address) {
        C_address = c_address;
    }
    public void setC_balance(double c_balance) {
        C_balance = c_balance;
    }
    public void setC_gender(char c_gender) {
        C_gender = c_gender;
    }
    public void setC_password(String c_password) {
        C_password = c_password;
    }
    public void setC_phone(String c_phone) {
        C_phone = c_phone;
    }
    public int getC_acc_No() {
        return C_acc_No;
    }
    public Integer getC_id() {
        return C_id;
    }
    public char getC_gender() {
        return C_gender;
    }
    public double getC_balance() {
        return C_balance;
    }
    public String getC_acc_Name() {
        return C_acc_Name;
    }
    public String getC_dob() {
        return C_dob;
    }
    public String getC_address() {
        return C_address;
    }
    public String getC_password() {
        return C_password;
    }
    public String getC_phone() {
        return C_phone;
    }
}
