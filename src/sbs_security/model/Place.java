
package sbs_security.model;
public class Place {
   private int Place_id;
   private String place;

    public Place() {
    }

    public Place(int Place_id, String place) {
        this.Place_id = Place_id;
        this.place = place;
    }

    public int getPlace_id() {
        return Place_id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace_id(int Place_id) {
        this.Place_id = Place_id;
    }

    public void setPlace(String place) {
        this.place = place;
    }
   
    
}
