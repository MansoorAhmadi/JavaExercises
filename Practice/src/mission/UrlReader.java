package mission;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class UrlReader {

    URLConnection urlConnection;

    {
        try {
            urlConnection = new URL("https://www.google.com").openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String mimeType = urlConnection.getContentType();


}
