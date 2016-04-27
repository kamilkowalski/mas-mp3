package overlapping;


public class Organization {
    private String name;
    private String address;
    private String governmentBranch;

    public Organization(String name, String address, String governmentBranch) {
        setName(name);
        setAddress(address);
        setGovernmentBranch(governmentBranch);
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

    public String getGovernmentBranch() {
        return governmentBranch;
    }

    public void setGovernmentBranch(String governmentBranch) {
        this.governmentBranch = governmentBranch;
    }

    public String toString() {
        return getName() + " (" + getAddress() + ") podlega pod " + getGovernmentBranch();
    }
}
