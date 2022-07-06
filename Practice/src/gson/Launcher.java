package gson;

public class Launcher {
    public static void main(String[] args) {

        //import Gson dependency in a Maven project. This a normal java project without maven.
//        Gson gson = new Gson();
        Car audi = new Car("Audi", "A4", 1.8, false);
        Car skoda = new Car("Škoda", "Octavia", 2.0, true);
        Car[] cars = {audi, skoda};
        Person johnDoe = new Person("John", "Doe", 2025550191, 35, cars);
//        System.out.println(gson.toJson(johnDoe));
    }
}

//    OUTPUT in JSON using Google-son or Gson
//{
//    "name":"John",
//        "surname":"Doe",
//        "cars":[
//    {
//        "manufacturer":"Audi",
//            "model":"A4",
//            "capacity":1.8,
//            "accident":false
//    },
//    {
//        "manufacturer":"Škoda",
//            "model":"Octavia",
//            "capacity":2.0,
//            "accident":true
//    }
//   ],
//    "phone":2025550191
//}

