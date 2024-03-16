package OOP.Seminar.Sem04.Task;

public class Main {
    public static void main(String[] args) {
        VetClinic<Cat> vetClinicC = new VetClinic<>();
        VetClinic<Dog> vetClinicD = new VetClinic<>();

        Dog dog1 = new Dog("bobik");
        Dog dog2 = new Dog("sharik");

        Cat cat1 = new Cat("Murka");
        Cat cat2 = new Cat("Barsik");

        vetClinicC.add(cat1);
        vetClinicC.help(cat1);
        vetClinicD.add(dog2);
        vetClinicD.help(dog2);
    }
}
