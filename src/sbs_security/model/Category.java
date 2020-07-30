
package sbs_security.model;
public class Category {
    private int C_id;
    private String C_name;
    private int salary;

    public void setC_id(int C_id) {
        this.C_id = C_id;
    }

    public void setC_name(String C_name) {
        this.C_name = C_name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getC_id() {
        return C_id;
    }

    public String getC_name() {
        return C_name;
    }

    public int getSalary() {
        return salary;
    }

    public Category(int C_id, String C_name, int salary) {
        this.C_id = C_id;
        this.C_name = C_name;
        this.salary = salary;
    }

    public Category() {
    }
}
