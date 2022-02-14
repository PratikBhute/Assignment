import javax.persistence.*;
import java.io.Serializable;

import java.util.Date;
import java.util.Objects;
@Entity
public class Laptop implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long lId;
    @Column(name = "PROCESSOR")
    private String cpu;
    @Column(name = "HARDdISK", length = 10, nullable = true,insertable = true,table ="laptop",updatable = true)
    private String ram;

    private  String hdd;
    private String laptopId;
    private  String processor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date mgf;
    @Version
    private Integer vesion;

    @Override
    public String toString() {
        return "Laptop{" +
                "lId=" + lId +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", laptopId='" + laptopId + '\'' +
                ", processor='" + processor + '\'' +
                ", mgf=" + mgf +
                ", vesion=" + vesion +
                '}';
    }

    public Date getMgf() {
        return mgf;
    }

    public void setMgf(Date mgf) {
        this.mgf = mgf;
    }

    public Integer getVesion() {
        return vesion;
    }

    public void setVesion(Integer vesion) {
        this.vesion = vesion;
    }

    public long getlId() {
        return lId;
    }

    public void setlId(long lId) {
        this.lId = lId;
    }



    public Laptop() {

    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam(String s) {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd(String s) {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getLaptopId(String s) {
        return laptopId;
    }

    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }

    public String getProcessor(String processor) {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(cpu, laptop.cpu) && Objects.equals(ram, laptop.ram) && Objects.equals(hdd, laptop.hdd) && Objects.equals(laptopId, laptop.laptopId) && Objects.equals(processor, laptop.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, hdd, laptopId, processor);
    }

    public Laptop(String cpu, String ram, String hdd, String laptopId, String processor) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.laptopId = laptopId;
        this.processor = processor;
    }
}

