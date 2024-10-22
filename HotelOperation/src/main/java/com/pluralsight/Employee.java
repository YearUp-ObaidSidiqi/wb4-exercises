package com.pluralsight;

public class Employee {
    private int empID;
    private String empName;
    private String empDepartment;
    private double empPayRate;
    private double empHoursWorked;

    // Constructor
    public Employee(int empID, String empName, String empDepartment, double empPayRate){
        this.empID = empID;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empPayRate = empPayRate;

    }

    // Getters and Setter
    public int getEmpID(){
        return this.empID;
    }
    public void setEmpID(int empID){
        this.empID = empID;
    }

    public String getEmpName(){
        return this.empName;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }

    public String getEmpDepartment(){
        return this.empDepartment;
    }
    public void setEmpDepartment(String empDepartment){
        this.empDepartment = empDepartment;
    }

    public double getEmpPayRate(){
        return this.empPayRate;
    }
    public void setEmpPayRate (double payRate){
        this.empPayRate = payRate;
    }

    public double getEmpHoursWorked() {
        return empHoursWorked;
    }
    public void setEmpHoursWorked(double empHoursWorked){
        this.empHoursWorked = empHoursWorked;
    }

    public double calculateOvertimePay (){
        double overTimePay = 0;
        if (empHoursWorked >40){
            overTimePay = ((empHoursWorked-40) *(1.5*this.empPayRate));
        }
        return overTimePay;
    }
    public double calculateRegularPay (){
        double regularPay = 0;
        if (!(empHoursWorked >40)){
            regularPay*=empHoursWorked;
        }
        return regularPay;
    }

    public double getOvertimeHours(){
        return empHoursWorked>40?empHoursWorked-40:0;
    }
    public double getRegularHours(){
        return empHoursWorked<=40 ? empHoursWorked:0;
    }
    public double getTotalPay(){
        return calculateRegularPay()+calculateOvertimePay();
    }
}
