package feb11;

import java.util.Objects;

public class Address {

   private String addrline1;
   private String addrline2;
   private String City;
   private String postalcode;

public Address(){}
    public Address(String addrline1, String addrline2, String city, String postalcode) {
        this.addrline1 = addrline1;
        this.addrline2 = addrline2;
        City = city;
        this.postalcode = postalcode;
    }
    public String getAddrline1() {
        return addrline1;
    }

    public void setAddrline1(String addrline1) {
        this.addrline1 = addrline1;
    }

    public String getAddrline2() {
        return addrline2;
    }

    public void setAddrline2(String addrline2) {
        this.addrline2 = addrline2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
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
                "addrline1='" + addrline1 + '\'' +
                ", addrline2='" + addrline2 + '\'' +
                ", City='" + City + '\'' +
                ", postalcode='" + postalcode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(addrline1, address.addrline1) && Objects.equals(addrline2, address.addrline2) && Objects.equals(City, address.City) && Objects.equals(postalcode, address.postalcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addrline1, addrline2, City, postalcode);
    }
}
