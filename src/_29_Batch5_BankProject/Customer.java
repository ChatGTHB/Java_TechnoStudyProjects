package _29_Batch5_BankProject;

public class Customer {

    // FIELDS
    private static int nextId =1000;
    private int customerId;
    private String firstName;
    private String lastName;
    private String city;

    // CONSTRUCTORS
    public Customer() {
    }

    public Customer( String firstName, String lastName, String city) {
        this.customerId = ++nextId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    // GETTER METHODS
    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }


    // TO STRING METHOD
    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
