public class CommandLineArgument {
    public static void main(String[] args) {

        for (int i=0; i< args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }

        //the process to pass the argument
        //terminal$
        //(base) Mansoors-MacBook-Pro:src mansoor$ cd /src/whatEverPackage/
        //(base) Mansoors-MacBook-Pro:src mansoor$ javac CommandLineArgument.java                   //compiling the .java to .class
        //(base) Mansoors-MacBook-Pro:src mansoor$ java CommandLineArgument Mansoor 123 321         //we the .class - no need to write .class

        //arguments [0] [Mansoor]
        //arguments [1] [123]
        //arguments [2] [321]

    }
}
