package java_study4;

import java.util.HashMap;
import java.util.Scanner;

class Location {
    private String lname;
    private double latitude, longitude;
 
    public Location(String lname, double latitude, double longitude) {
        super();
        this.lname = lname;
        this.latitude = latitude;
        this.longitude = longitude;
    }
 
    public String getLname() {
        return lname;
    }
 
    public void setLname(String lname) {
        this.lname = lname;
    }
 
    public double getLatitude() {
        return latitude;
    }
 
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
 
    public double getLongitude() {
        return longitude;
    }
 
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
 
}


public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Location> hv = new HashMap<String, Location>();
		 
        Scanner sc = new Scanner(System.in);
 
        Location seoul = new Location("seoul", 36.5, 124.9);
        Location daejeon = new Location("daejeon", 36.3, 127.3);
        Location daegu = new Location("daegu", 35.8, 127.5);
        Location busan = new Location("busan", 36.1, 128.2);
        Location suwon = new Location("suwon", 35.2, 127.7);
 
        hv.put(seoul.getLname(), seoul);
        hv.put(daejeon.getLname(), daejeon);
        hv.put(daegu.getLname(), daegu);
        hv.put(busan.getLname(), busan);
        hv.put(suwon.getLname(), suwon);
 
        String city;
 
        while (true) {
            System.out.print("search (Exit: q): ");
            city = sc.next();
 
            if (city.equals("q")) {
                sc.close();
                System.exit(0);
            }
 
            Location obj = hv.get(city);
            if (obj != null) {
                System.out.println("City Name: " + obj.getLname());
                System.out.println("Latitude: " + obj.getLatitude());
                System.out.println("Longitude: " + obj.getLongitude());
            } else {
                System.out.println("no city");
            }
        }

	}

}
