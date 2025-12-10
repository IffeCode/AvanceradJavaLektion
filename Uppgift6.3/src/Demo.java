import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(cat);
        animals.add(cow);

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
