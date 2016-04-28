package mp3;

import dynamic.Monster;
import dynamic.Player;
import multi.HybridVehicle;
import multi.LandVehicle;
import multi.WaterVehicle;
import multi2.*;
import overlapping.Building;
import overlapping.CoalHeatedBuilding;
import overlapping.Company;
import overlapping.Organization;
import polymorphism.RuralNeighbourhood;
import polymorphism.UrbanNeighbourhood;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MP3 {
    public static void main(String[] args) {
        try {
            RuralNeighbourhood rn = new RuralNeighbourhood("Marki", 40000);
            UrbanNeighbourhood un = new UrbanNeighbourhood("Mokotów", 200000, 0.2f);
            System.out.println(rn);
            System.out.println(un);
        } catch(Exception e){
            System.out.println(e);
        }

        try {
            Set<Company> companies = new HashSet<>();
            companies.add(new Company("Onet.pl", "ul. Milenialna 15"));
            Building administrative = new Building("Siedziba GROM", 1500, new Organization("GROM", "ul. Wiejska", "Ministerstwo Obrony Narodowej"));
            Building office = new Building("Millenium Plaza", 3100, companies);
            Building both = new Building("Pałac Kultury", 5300, companies, new Organization("Biuro Poselskie", "al. Jerozolimskie 15", ".Nowoczesna Prawica Obywatelska"));

            System.out.println(administrative);
            System.out.println(office);
            System.out.println(both);
        } catch(Exception e) {
            System.out.println(e);
        }

        LandVehicle lv = new LandVehicle("Chevrolet Camaro", 120000);
        WaterVehicle wv = new WaterVehicle("Zaglówka Regina", WaterVehicle.WaterVehicleType.MOTORBOAT);
        HybridVehicle hv = new HybridVehicle("Plywający samochód", 70000, WaterVehicle.WaterVehicleType.MOTORBOAT);

        System.out.println("---------------");
        System.out.println(lv);
        System.out.println("---------------");
        System.out.println(wv);
        System.out.println("---------------");
        System.out.println(hv);
        System.out.println("---------------");

        try {
            Set<Company> companies = new HashSet<>();
            companies.add(new Company("Marvipol Development", "ul. Milenialna 15"));
            Building pkin = new Building("Pałac Kultury", 5300, companies, new Organization("Biuro Poselskie", "al. Jerozolimskie 15", ".Nowoczesna Prawica Obywatelska"));
            CoalHeatedBuilding chb = new CoalHeatedBuilding(pkin);

            System.out.println(pkin);
        } catch(Exception e) {
            System.out.println(e);
        }


        try {
            Player pl = new Player("Kamil", 100, 500, 40, 6);
            Monster ms = new Monster("Troll", 20, 350, 120, 50);

            Player pls = new Player(ms, 10);

            System.out.println(pl);
            System.out.println(ms);
            System.out.println(pls);
        } catch(Exception e){
            System.out.println(e);
        }

        // Wielodziedziczenie

        List<Sprawa> sprawy = new ArrayList<>();
        sprawy.add(new Sprawa("Zepsuty monitor"));
        sprawy.add(new Sprawa("Wymiana karty graficznej"));

        Set<Produkt> produkty = new HashSet<>();
        produkty.add(new Produkt("Monitor LCD Iyama"));
        produkty.add(new Produkt("Klawiatura Logitech"));
        produkty.add(new Produkt("Intel Core i7"));

        Serwis serwis = new Serwis("ul. Niepodległości 15", sprawy);
        Sklep sklep = new Sklep("Elektro Śmieci", produkty);
        SklepSerwis sklepSerwis = new SklepSerwis("Super Elektro Śmieci", "ul. Płocka 15", sprawy, produkty);

        System.out.println("-------------------");
        System.out.println(serwis);
        System.out.println("-------------------");
        System.out.println(sklep);
        System.out.println("-------------------");
        System.out.println(sklepSerwis);
        System.out.println("-------------------");

        Produkt prod = sklepSerwis.znajdzProdukt("Monitor LCD Iyama");

        if (prod != null) {
            System.out.println("Znaleziono produkt: " + prod.toString());
        } else {
            System.out.println("Nie znaleziono produktu!");
        }
    }
}
