import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Employee extends Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeID;
    private String departmentName;
    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,
            targetEntity = ContactDetails.class,fetch = FetchType.LAZY )
    private List<ContactDetails>contactDetails;
    //private Set<ContactDetails>contactDetails;  -----------When we are not required Dublicate Data

    public Employee(boolean isActive, long employeeID, String departmentName, Laptop laptop) {
        super(isActive);
        this.employeeID = employeeID;
        this.departmentName = departmentName;
        this.laptop = laptop;
    }

    public Employee() {

    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID && Objects.equals(departmentName, employee.departmentName) && Objects.equals(laptop, employee.laptop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeID, departmentName, laptop);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", departmentName='" + departmentName + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
