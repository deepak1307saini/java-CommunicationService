import lombok.Builder;
import lombok.ToString;

@Builder
@ToString

public class User {
    //All final attributes

    private Long Id;
    private String name; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional


    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return  "Name :"+name+", id :"+Id;
    }

}