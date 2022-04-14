package basics.inheritanceOfThree;

//Class B extends ClassA
//Class C extend Class B
public class ClassC extends ClassB {

    //CAPGEMINI

    public void execute(){
        super.execute();
        variable++;
        System.out.println(variable);
    }


    public static void main(String[] args) {
        ClassC c = new ClassC();
        c.execute();
    }
}


