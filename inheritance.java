
abstract class Employee {

    public final String firstname;
    private final String lastname;
    public Employee(String fname, String Lname) {
        this.firstname = fname;
        this.lastname = Lname;
    }

    public String getfirstname() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getfirstname(), getlastname());
    }

    public abstract String checkforabstract();

}

class SalariedEmployee extends Employee {

    private double weeklysalary;

    public SalariedEmployee(String firstname, String lastname, double weeklysalary) {
        super(firstname, lastname);
        if (weeklysalary < 1000.0) {
            throw new IllegalArgumentException("Weekly Salary must be more than Rs. 1000.0");
        }
        this.weeklysalary = weeklysalary;
        System.out.println(super.firstname);
    }

    public double getweeklysalary() {
        return weeklysalary;
    }

    @Override
    public String toString() {
        return String.format("Employee Name: %s %nSalary: %s", super.toString(), getweeklysalary());
    }

    public String checkforabstract() {
        return String.format("Hello im abstract");
    }
}

public class inheritance {

    public static void main(String args[]) {
        SalariedEmployee obj = new SalariedEmployee("somesh", "goyal", 1000.0);
        System.out.println(obj.toString());
        System.out.println(obj.checkforabstract());
    }
}
