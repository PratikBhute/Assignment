import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Project implements Serializable
{
    public static final long UniqueSerialId=5678789;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectID;
    private String projectName;
    private String contactPerson;
    @Embedded
    private Address address;

    public Long getProjectID() {
        return projectID;
    }

    public void setProjectID(Long projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(projectID, project.projectID) && Objects.equals(projectName, project.projectName) && Objects.equals(contactPerson, project.contactPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectID, projectName, contactPerson);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID=" + projectID +
                ", projectName='" + projectName + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                '}';
    }

    public Project(Long projectID, String projectName, String contactPerson) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.contactPerson = contactPerson;
    }

    public Project() {
    }
}