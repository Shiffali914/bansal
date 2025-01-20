package jan18.Aggregation;

public class Student {
    private Name name;
    private String email;
    private String phone;

    public Student(Name name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
