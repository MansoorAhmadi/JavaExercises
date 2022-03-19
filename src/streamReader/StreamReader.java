package streamReader;

import java.io.*;

public class StreamReader {


    /**
     * Reads from the giver reader and print to
     */
    //void print() is the original
    //added public static to test it in the main


    public static void printer (InputStreamReader inputStream){

        char[] value = new char[45];
        try {
            inputStream.read(value);
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("src/streamReader/InputStreamReader.txt");
        InputStreamReader inputStream = new InputStreamReader(file);
        printer(inputStream);
    }

    //binary 01 = decimal 1
    //binary 11 = decimal 3
    // 1 binary || 1 = 1 true
    // 0 binary || 1 = 1 true

    //Result 11


    //OR Operation: 1


}
