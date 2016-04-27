package overlapping;

import java.util.HashSet;
import java.util.Set;

public class Building {
    private String name;
    private int area;

    private Set<AdministrativeBuilding> administrativeBuildings = new HashSet<>();
    private Set<OfficeBuilding> officeBuildings = new HashSet<>();
    private Set<HeatedBuilding> heatedBuildings = new HashSet<>();

    public Building(String name, int area) {
        setName(name);
        setArea(area);
    }

    public Building(String name, int area, Set<Company> companies) throws Exception {
        this(name, area);
        addOfficeBuilding(companies);
    }

    public Building(String name, int area, Organization organization) throws Exception {
        this(name, area);
        addAdministrativeBuilding(organization);
    }

    public Building(String name, int area, Set<Company> companies, Organization organization) throws Exception {
        this(name, area);
        addOfficeBuilding(companies);
        addAdministrativeBuilding(organization);
    }

    private void addAdministrativeBuilding(Organization organization) throws Exception {
        addAdministrativeBuilding(new AdministrativeBuilding(organization));
    }

    public void addAdministrativeBuilding(AdministrativeBuilding ab) throws Exception {
        if (!administrativeBuildings.contains(ab)) {
            if (administrativeBuildings.size() > 0) {
                throw new Exception("Można dodać tylko jedną relację");
            }
            administrativeBuildings.add(ab);
            ab.setBuilding(this);
        }
    }

    public void removeAdministrativeBuilding(AdministrativeBuilding ab) {
        if (administrativeBuildings.contains(ab)) {
            administrativeBuildings.remove(ab);
        }
    }

    private void addOfficeBuilding(Set<Company> companies) throws Exception {
        addOfficeBuilding(new OfficeBuilding(companies));
    }

    public void addOfficeBuilding(OfficeBuilding ob) throws Exception {
        if (!officeBuildings.contains(ob)) {
            if (officeBuildings.size() > 0) {
                throw new Exception("Można dodać tylko jedną relację");
            }
            officeBuildings.add(ob);
            ob.setBuilding(this);
        }
    }

    public void removeOfficeBuilding(OfficeBuilding ob) {
        if (officeBuildings.contains(ob)) {
            officeBuildings.remove(ob);
        }
    }

    public void addHeatedBuilding(HeatedBuilding hb) throws Exception {
        if (!heatedBuildings.contains(hb)) {
            if (heatedBuildings.size() > 0) {
                throw new Exception("Można dodać tylko jedną relację");
            }
            heatedBuildings.add(hb);
            hb.setBuilding(this);
        }
    }

    public void removeHeatedBuilding(HeatedBuilding hb) {
        if (heatedBuildings.contains(hb)) {
            heatedBuildings.remove(hb);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("----------------\n");
        sb.append("Opis budynku " + getName() + "\n");

        if (heatedBuildings.size() > 0) {
            double cost = 0;
            for(HeatedBuilding hb : heatedBuildings) {
                cost += hb.estimateHeatingCosts();
            }
            sb.append("Koszty ogrzewania: " + cost + " zl\n");
        }

        if (administrativeBuildings.size() > 0) {
            sb.append("Jest budynkiem administracyjnym\n");
            for(AdministrativeBuilding ab : administrativeBuildings) {
                sb.append(ab.toString() + "\n");
            }
        }

        if (officeBuildings.size() > 0) {
            sb.append("Jest budynkiem biurowym\n");
            for(OfficeBuilding ob : officeBuildings) {
                sb.append(ob.toString() + "\n");
            }
        }

        sb.append("+++++++++++++++++\n");

        return sb.toString();
    }
}
