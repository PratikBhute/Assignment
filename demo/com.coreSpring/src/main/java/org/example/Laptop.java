package org.example;

import java.util.Objects;

public class Laptop
{
    private Long lid;
    private String modelName;
    private String cpu,hdd,ram,graphicCard;

    public Laptop() {
    }

    public Laptop(Long lid, String modelName, String cpu, String hdd, String ram, String graphicCard) {
        this.lid = lid;
        this.modelName = modelName;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.graphicCard = graphicCard;
    }

    public Laptop(String lid, String cpu, String graphicCard, String hdd, String ram) {

    }

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(lid, laptop.lid) && Objects.equals(modelName, laptop.modelName) && Objects.equals(cpu, laptop.cpu) && Objects.equals(hdd, laptop.hdd) && Objects.equals(ram, laptop.ram) && Objects.equals(graphicCard, laptop.graphicCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lid, modelName, cpu, hdd, ram, graphicCard);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", modelName='" + modelName + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                '}';
    }
}