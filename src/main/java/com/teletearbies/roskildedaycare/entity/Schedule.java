package com.teletearbies.roskildedaycare.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schedule_id;

    @OneToOne(mappedBy = "employeeSchedule")
    private Employee employee;

    private String shiftName;
    private LocalDateTime time;

    public Schedule(){}

    public Schedule(Integer schedule_id, Employee employee, String shiftName, LocalDateTime time) {
        this.schedule_id = schedule_id;
        this.employee = employee;
        this.shiftName = shiftName;
        this.time = time;
    }

    public Integer getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
