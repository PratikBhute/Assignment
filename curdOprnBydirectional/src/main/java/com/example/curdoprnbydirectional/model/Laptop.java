package com.example.curdoprnbydirectional.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Laptop implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5762231962793190350L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lid;
    private String brand, cpu, hdd, ram;
    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;

    public Laptop() {
    }

    public Laptop(Long lid, String brand, String cpu, String hdd, String ram, Student student) {
        this.lid = lid;
        this.brand = brand;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.student = student;
    }

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Student getEmployee() {
        return student;
    }

    public void setEmployee(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(lid, laptop.lid) && Objects.equals(brand, laptop.brand) && Objects.equals(cpu, laptop.cpu) && Objects.equals(hdd, laptop.hdd) && Objects.equals(ram, laptop.ram) && Objects.equals(student, laptop.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lid, brand, cpu, hdd, ram, student);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", employee=" + student +
                '}';
    }
}