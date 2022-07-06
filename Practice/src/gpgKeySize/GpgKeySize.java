package gpgKeySize;

import java.io.File;

/**
 * @author : mansoorahmadi on 20/06/2022
 */
public class GpgKeySize {
    public static void main(String[] args) {


        File file = new File("Users/mansoorahmadi/Desktop/GAEL_Systems/key/ma.txt");
        if (file.exists()) {
            double bytes = file.length();
            double kilobytes = (bytes / 1024);

            // converting file size to bytes to kb
            double megabytes = (kilobytes / 1024);

            // converting file size tolb to mb
            double gigabytes = (megabytes / 1024);

            System.out.println("bytes : " + bytes);
            System.out.println("kilobytes : " + kilobytes);
            System.out.println("megabytes : " + megabytes);

            //La réponse:
            //bytes : 3490.0
            //kilobytes : 3.408203125
            //megabytes : 0.0033283233642578125
            //
        }
        else {
            System.out.println("File does not exists!");
        }

    }
}
