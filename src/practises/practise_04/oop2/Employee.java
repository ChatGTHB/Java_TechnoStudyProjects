package practises.practise_04.oop2;

public class Employee {
    String name;
    String surname;
    String phoneNumber;
    String idNumber;
    String department;

    public Employee() {
        System.out.println("General Manager Created.");
    }

    public Employee(String name, String surname, String phoneNumber, String idNumber, String department) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
        this.department = department;
    }

    void printSalary(){

    }
}


