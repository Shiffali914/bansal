package immutable;

public class Address {
   private String city;        //there is only one data field in Address clas

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{ city=" + city + "}";
    }
}
