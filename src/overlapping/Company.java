package overlapping;


public class Company {
    private String name;
    private String address;

    public Company(String name, String address) {
        setName(name);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Firma: " + getName() + " (" + getAddress() + ")";
    }
}
