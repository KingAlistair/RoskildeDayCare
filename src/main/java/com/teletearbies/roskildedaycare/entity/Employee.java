package com.teletearbies.roskildedaycare.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    @Column(nullable = false, unique = false, length = 45)
    private String name;

    @Column(length = 45, nullable = false, name = "first_name")
    private String address;
    @Column(length = 45, nullable = false, name = "last_name")
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "schedule_id")
    private Schedule employeeSchedule;

    public Employee(){}

    public Employee(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer emplpoyee_id) {
        this.employee_id = emplpoyee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Schedule getEmployeeSchedule() {
        return employeeSchedule;
    }

    public void setEmployeeSchedule(Schedule employeeSchedule) {
        this.employeeSchedule = employeeSchedule;
    }
}
