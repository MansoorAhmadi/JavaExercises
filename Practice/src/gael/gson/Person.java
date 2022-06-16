package gael.gson;

public class Person {
    public String name;
    public String surname;
    public Car[] cars;
    public int phone;
    public transient int age;

    public Person() {
    }

    public Person(String name, String surname, int phone, int age, Car[] cars) {
        this.name = name;
        this.surname = surname;
        this.cars = cars;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append(" ").append(surname).append("\n");
        sb.append("Phone: ").append(phone).append("\n");
        sb.append("Age: ").append(age).append("\n");
        int i = 0;
        for (Car item : cars) {
            i++;
            sb.append("Car ").append(i).append(": ").append(item).append("\n");
        }
        return sb.toString();
    }
}
