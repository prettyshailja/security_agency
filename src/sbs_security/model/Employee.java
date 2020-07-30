

package sbs_security.model;

public class Employee {

    public Employee() {
    }

    public Employee(int emp_id, String First_name, String Middle_name, String Last_name, String DOB, String Address, String city, String state, String aadhar_no, int contact_no, int C_id, String image, String DOJ) {
        this.emp_id = emp_id;
        this.First_name = First_name;
        this.Middle_name = Middle_name;
        this.Last_name = Last_name;
        this.DOB = DOB;
        this.Address = Address;
        this.city = city;
        this.state = state;
        this.aadhar_no = aadhar_no;
        this.contact_no = contact_no;
        this.C_id = C_id;
        this.image = image;
        this.DOJ = DOJ;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public void setMiddle_name(String Middle_name) {
        this.Middle_name = Middle_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAadhar_no(String aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public void setC_id(int C_id) {
        this.C_id = C_id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public String getMiddle_name() {
        return Middle_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getAadhar_no() {
        return aadhar_no;
    }

    public int getContact_no() {
        return contact_no;
    }

    public int getC_id() {
        return C_id;
    }

    public String getImage() {
        return image;
    }

    public String getDOJ() {
        return DOJ;
    }
    private int emp_id;
 private String First_name;  
 private String Middle_name;
 private String Last_name;  
 private String DOB;        
 private String Address;     
 private String city;       
 private String state;       
 private String aadhar_no;   
 private int contact_no; 
 private int C_id;       
 private String image;
 private String DOJ;
}
