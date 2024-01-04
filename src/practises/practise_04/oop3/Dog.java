package practises.practise_04.oop3;


public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Hav hav");
    }

    @Override
    public void meal() {
        System.out.println("Bone");
    }
}
