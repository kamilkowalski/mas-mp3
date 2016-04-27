package overlapping;

public class AdministrativeBuilding {
    private Organization organization;
    private Building building;

    public AdministrativeBuilding(Organization organization) {
        setOrganization(organization);
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public void setBuilding(Building building) throws Exception {
        if (this.building == building) return;

        if (this.building != null) {
            this.building.removeAdministrativeBuilding(this);
        }

        this.building = building;
        this.building.addAdministrativeBuilding(this);
    }

    public String toString() {
        return "Organizacja: " + getOrganization().toString();
    }
}
