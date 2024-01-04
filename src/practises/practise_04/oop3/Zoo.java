package practises.practise_04.oop3;

public class Zoo {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.voice();
        cat.meal();

        Animal cat2=new Cat();

        Dog dog=new Dog();
        dog.voice();
        dog.meal();

        giveVoice(cat);
        giveVoice(dog);
    }

    static void giveVoice(Animal animal){
        animal.voice();
    }
}
