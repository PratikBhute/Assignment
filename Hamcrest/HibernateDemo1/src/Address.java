public class Address
{
    private String houseno,streetno, locality, city, villegage, distric, state, pin;

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getStreetno() {
        return streetno;
    }

    public void setStreetno(String streetno) {
        this.streetno = streetno;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVillegage() {
        return villegage;
    }

    public void setVillegage(String villegage) {
        this.villegage = villegage;
    }

    public String getDistric() {
        return distric;
    }

    public void setDistric(String distric) {
        this.distric = distric;
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

    public Address(String houseno, String streetno, String locality, String city, String villegage, String distric, String state, String pin) {
        this.houseno = houseno;
        this.streetno = streetno;
        this.locality = locality;
        this.city = city;
        this.villegage = villegage;
        this.distric = distric;
        this.state = state;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseno='" + houseno + '\'' +
                ", streetno='" + streetno + '\'' +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", villegage='" + villegage + '\'' +
                ", distric='" + distric + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }

    public Address() {
    }
}
