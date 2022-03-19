package improveCode;

public class Main {

    //The question was to IMPROVE THE CODE
    static String getAnimalName(Animal animal){
        return animal.getName();
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Sammy");
        Animal cat = new Cat("Smokey");
        System.out.println(getAnimalName(dog));
        System.out.println(getAnimalName(cat));
    }
}
