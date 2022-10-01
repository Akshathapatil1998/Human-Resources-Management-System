/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class EmployeeHistory {
       private ArrayList<Employee> history;
       
       public EmployeeHistory(){
           this.history=new  ArrayList<Employee>();
       }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
       
       
     public  Employee addNewemps(){
        
      Employee newEmps= new Employee();
       history.add(newEmps);
        return newEmps;
     }
     public void deleteemp(Employee e){
         history.remove(e);
     }
     
     public Employee getEmployeeById(String Name) {
         for (Employee e: history) {
             if(e.getEmpid().equals(Name)) {
                 return e;
             }
         }
         return null;
                 }
         
         
         
         
         

         // look for the employee in the arrylist with that id and return that Employeee object
     }

