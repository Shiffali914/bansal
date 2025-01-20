package jan18.Aggregation;

public class Address {

    private String Houseno;
   private String city;
   private String country;
   private String postalcode;

    public Address(String houseno, String city, String country, String postalcode) {
        Houseno = houseno;
        this.city = city;
        this.country = country;
        this.postalcode = postalcode;
    }

    public String getHouseno() {
        return Houseno;
    }

    public void setHouseno(String houseno) {
        Houseno = houseno;
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

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Houseno='" + Houseno + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalcode='" + postalcode + '\'' +
                '}';
    }
}
