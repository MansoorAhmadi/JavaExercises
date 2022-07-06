import java.io.IOException;
import java.io.InputStream;

/**
 * @author : Mansoor Ahmadi on 06/07/2022
 */
public class GrepPiping
{
   public static void main(String[] args) throws IOException
   {
      InputStream in = System.in;

      String string;

      byte[] buffer = new byte[4096];
      int readBytesCount = 0;
      while ((readBytesCount = in.read(buffer)) > 0)
      {
         string = new String(buffer, 0, readBytesCount);
         System.out.print("4096");
         System.out.print(string);
      }
   }

   // store the jar in a folder. Open the folder with terminal location. Type the following commands:

   // count the number of characters[4096] of the txt file provided
   // $java -jar myAppStream2.jar < sampleTextFile.txt | grep -i -c 4096
   // 530

   //to confirm if the answer 530 is correct.
   // 530 * 4096 = 2 170 880
   // 2 170 889 is the size of the file in bytes, which means it's correct.

   // count the number of lines of the txt file provided
   // $java -jar myAppStream2.jar < sampleTextFile.txt | wc -l
   // 5697
   // 5697 is right number of lines. To confirm it, open the txt file in a text editor and verify it

   // search for the character[4096] in the txt file
   // $java -jar myAppStream2.jar < sampleTextFile.txt | grep 4096
   // the results are good. Many lines

}
