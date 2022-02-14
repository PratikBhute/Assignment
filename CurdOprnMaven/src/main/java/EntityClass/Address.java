package EntityClass;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Address implements Serializable
{
    private static final long serialVersionUID = 6900026827139637010L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addressID;
    private String street, city,country,state, pin;

    public Address() {
    }

    public Address(long addressID, String street, String city, String country, String state, String pin) {
        this.addressID = addressID;
        this.street = street;
        this.city = city;
        this.country = country;
        this.state = state;
        this.pin = pin;
    }

    public long getAddressID() {
        return addressID;
    }

    public void setAddressID(long addressID) {
        this.addressID = addressID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressID == address.addressID && Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(country, address.country) && Objects.equals(state, address.state) && Objects.equals(pin, address.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressID, street, city, country, state, pin);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressID=" + addressID +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
