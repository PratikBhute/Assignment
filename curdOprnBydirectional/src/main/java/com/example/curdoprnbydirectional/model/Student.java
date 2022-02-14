package com.example.curdoprnbydirectional.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Student implements Serializable
{

    /**
     *
     */
    private static final long serialVersionUID = 2392205494352950635L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eid;
    private String name, phone, city;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Laptop> laptopList;

    public Student() {
    }

    public Student(Long eid, String name, String phone, String city, List<Laptop> laptopList) {
        this.eid = eid;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.laptopList = laptopList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    public void setLaptopList(List<Laptop> laptopList) {
        this.laptopList = laptopList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(eid, student.eid) && Objects.equals(name, student.name) && Objects.equals(phone, student.phone) && Objects.equals(city, student.city) && Objects.equals(laptopList, student.laptopList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, name, phone, city, laptopList);
    }

    @Override
    public String toString() {
        return "Student{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", laptopList=" + laptopList +
                '}';
    }
}
