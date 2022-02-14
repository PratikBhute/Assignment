package com.example.assisment_1.moduel;

import java.util.Objects;

public class Employee
{
    private Long eid;
    private String eName;
    private String ePhone;

    public Employee() {
    }

    public Employee(Long eid, String eName, String ePhone) {
        this.eid = eid;
        this.eName = eName;
        this.ePhone = ePhone;
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getePhone() {
        return ePhone;
    }

    public void setePhone(String ePhone) {
        this.ePhone = ePhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(eid, employee.eid) && Objects.equals(eName, employee.eName) && Objects.equals(ePhone, employee.ePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, eName, ePhone);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", ePhone='" + ePhone + '\'' +
                '}';
    }
}
