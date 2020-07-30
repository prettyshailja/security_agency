
package sbs_security.model;
public class Client {
    private int id;
    private String Full_name;
    private String Address;
    private int Contact_no;
    private String email_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFull_name(String Full_name) {
        this.Full_name = Full_name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setContact_no(int Contact_no) {
        this.Contact_no = Contact_no;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getFull_name() {
        return Full_name;
    }

    public String getAddress() {
        return Address;
    }

    public int getContact_no() {
        return Contact_no;
    }

    public String getEmail_id() {
        return email_id;
    }

    public Client(int id, String Full_name, String Address, int Contact_no, String email_id) {
        this.id = id;
        this.Full_name = Full_name;
        this.Address = Address;
        this.Contact_no = Contact_no;
        this.email_id = email_id;
    }

    public Client() {
    }

}
