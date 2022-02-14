package com.example.curdoprationonetomanyrelationship.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private int mobile;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DEPT_ID")
    private Department department;

    public Student() {
    }

    public Student(Long id, String name, int mobile, Department department) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return mobile == student.mobile && Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mobile, department);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                ", department=" + department +
                '}';
    }
}