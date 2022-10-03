/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Employee {
    
    private String name; 
    private int empid;
    private int age;
    private String gender;
    private String startdate;
    private String level;
    private String teaminfo;
    private String positiontitle;
    private long cellphonenum;
    private String emailid;
    private String photo;

    public Employee() {
    }

    public Employee(String name, int empid, int age, String gender, String startdate, String level, String teaminfo, String positiontitle, long cellphonenum, String emailid, String photo) {
        this.name = name;
        this.empid = empid;
        this.age = age;
        this.gender = gender;
        this.startdate = startdate;
        this.level = level;
        this.teaminfo = teaminfo;
        this.positiontitle = positiontitle;
        this.cellphonenum = cellphonenum;
        this.emailid = emailid;
        this.photo = photo;
    }
   
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeaminfo() {
        return teaminfo;
    }

    public void setTeaminfo(String teaminfo) {
        this.teaminfo = teaminfo;
    }

    public String getPositiontitle() {
        return positiontitle;
    }

    public void setPositiontitle(String positiontitle) {
        this.positiontitle = positiontitle;
    }

    public long getCellphonenum() {
        return cellphonenum;
    }

    public void setCellphonenum(long cellphonenum) {
        this.cellphonenum = cellphonenum;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    
    
    @Override
   public String toString(){
       return name;
       
   }
   
    
    
}
