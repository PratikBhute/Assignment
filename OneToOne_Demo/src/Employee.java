import javax.persistence.*;
import java.util.List;
import java.util.Objects;

public class Employee extends Person
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeID;
    private String departmentName;
    @OneToOne(cascade = CascadeType.ALL)
    private Person person;
    public Employee(int pId, String pName, String pPhone, String pAddress,
                    boolean isActive, long employeeID, String departmentName)
    {
        super(pId, pName, pPhone, pAddress, isActive);
        this.employeeID = employeeID;
        this.departmentName = departmentName;

    }

    public Employee(long employeeID, String departmentName) {
        this.employeeID = employeeID;
        this.departmentName = departmentName;

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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID && Objects.equals(departmentName, employee.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeID, departmentName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
