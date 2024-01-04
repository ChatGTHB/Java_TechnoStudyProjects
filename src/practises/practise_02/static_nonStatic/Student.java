package practises.practise_02.static_nonStatic;

public class Student {
    String name;
    String surname;
    String phoneNumber;

    public void printID(String name,String surname,String phoneNumber){
        System.out.println("Name = " + name);
        System.out.println("Surname = " + surname);
        System.out.println("PhoneNumber = " + phoneNumber);
    }

    public static void print(){
        System.out.println("Printed");
    }
}
