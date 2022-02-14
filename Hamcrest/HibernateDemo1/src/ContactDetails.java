import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class ContactDetails<ContenctType> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cid;
    private String phone, email;
    @Embedded
    private ContenctType contenctType;

    public ContactDetails() {
    }

    public ContactDetails(Long cid, String phone, String email, ContenctType contenctType) {
        this.cid = cid;
        this.phone = phone;
        this.email = email;
        this.contenctType = contenctType;
    }

    public ContactDetails(String s, String s1, ContenctType business) {
    }

    public Long getCid() {

        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContenctType getContenctType() {
        return contenctType;
    }

    public void setContenctType(ContenctType contenctType) {
        this.contenctType = contenctType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDetails<?> that = (ContactDetails<?>) o;
        return Objects.equals(cid, that.cid) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(contenctType, that.contenctType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, phone, email, contenctType);
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "cid=" + cid +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", contenctType=" + contenctType +
                '}';
    }
}