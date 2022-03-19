package HashCode.example1;

public class Employee {
    private int id;
    private String name;
    private String address;

    //@constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //@getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
