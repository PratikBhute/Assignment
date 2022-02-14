package EntityClass;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Table(name = "MY_USER_TABLE")
@Entity
public class UserDetails implements Serializable
{
    private static final long serialVersionUID = -855488448456L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long userId;
    private String userNsame, userEmail,userPhone;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public UserDetails(long userId, String userNsame, String userEmail, String userPhone, Address address) {
        this.userId = userId;
        this.userNsame = userNsame;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.address = address;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserNsame() {
        return userNsame;
    }

    public void setUserNsame(String userNsame) {
        this.userNsame = userNsame;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return userId == that.userId && Objects.equals(userNsame, that.userNsame) && Objects.equals(userEmail, that.userEmail) && Objects.equals(userPhone, that.userPhone) && Objects.equals(address, that.address);
    }
}