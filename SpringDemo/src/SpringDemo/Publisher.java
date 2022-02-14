package SpringDemo;

import java.util.Objects;

public class Publisher
{
    private long pID;
    private String name ,location;

    public void publisherCreate(){
        System.out.println("publisher object creating");
    }
    public void destroy(){
        System.out.println("publisher object deleting");
    }


    public Publisher() {
    }

    public Publisher(long pID, String name, String location) {
        this.pID = pID;
        this.name = name;
        this.location = location;
    }

    public long getpID() {
        return pID;
    }

    public void setpID(long pID) {
        this.pID = pID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return pID == publisher.pID && Objects.equals(name, publisher.name) && Objects.equals(location, publisher.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pID, name, location);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "pID=" + pID +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
