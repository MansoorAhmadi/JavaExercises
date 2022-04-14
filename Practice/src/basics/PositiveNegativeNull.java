package basics;

public class PositiveNegativeNull {

    public static String decrire(int number){
        String description = "";
        if (number==0){
            description = "Le nombre est nul";
        }
        if (number<0){
            description = "Le nombre est négatif";
        }
        if (number>0){
            description = "Le nombre est positif";
        }
        return description;
    }

    public static void main(String[] args) {
        System.out.println(decrire(5));
        System.out.println(decrire(0));
        System.out.println(decrire(-2));
    }
}
