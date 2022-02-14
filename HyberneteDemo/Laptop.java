public class Laptop
{
    private int lid;
    private String cpu, hdd, ram;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Laptop laptop = (Laptop) object;
        return lid == laptop.lid && java.util.Objects.equals(cpu, laptop.cpu) && java.util.Objects.equals(hdd, laptop.hdd) && java.util.Objects.equals(ram, laptop.ram);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), lid, cpu, hdd, ram);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    public Laptop(int lid, String cpu, String hdd, String ram) {
        this.lid = lid;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }
}