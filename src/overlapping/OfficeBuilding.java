package overlapping;

import java.util.Set;

public class OfficeBuilding {
    private Set<Company> companies;
    private Building building;

    public OfficeBuilding(Set<Company> companies) {
        setCompanies(companies);
    }

    public Set<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }

    public void setBuilding(Building building) throws Exception{
        if (this.building == building) return;

        if (this.building != null) {
            this.building.removeOfficeBuilding(this);
        }

        this.building = building;
        this.building.addOfficeBuilding(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Company cp : getCompanies()) {
            sb.append(cp.toString());
        }

        return sb.toString();
    }
}
