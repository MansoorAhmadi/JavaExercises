package basics;

import java.io.*;
import java.nio.charset.Charset;

public class TheInputStreamReader {

    /***
     * In the case of "InputStreamReader" you can use 'char c' in place of 'int c' and instead of '-1' value, you can use 'null'. Like this :
     * Because you are using InputStreamReader which do character based reading. So, there is no need to set datatype 'int' and then to cast it using 'char',
     * it is unnecessary. We need to do this in the case of InputStream as it does byte based reading.
     */

    public static void main(String[] args) throws IOException {

        // Creates an array of character
        char[] array = new char[32];

        // Creates a FileInputStream
        FileInputStream file = new FileInputStream("/Users/mansoorahmadi/Documents/IntelliJ_PROJECTS/JavaExercises/Practice/src/basics/InputStreamReader.txt");

        // Creates an InputStreamReader
        InputStreamReader input = new InputStreamReader(file);

        // Reads characters from the file
        input.read(array);
        System.out.println(array);

        // Closes the reader
        input.close();

    }


}
