package webCrawler;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.FilenameUtils;

public class testApacheCommons {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://video.flos1-1.fna.fbcdn.net/v/t42.1790-2/26126443_1772650919701519_2777074387000492032_n.mp4?efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&oh=b2c586861a704068e092dfdaa2c47b78&oe=5A4C6E3A");

     // Open connection to URL.
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Connect to server.
        connection.connect();


        // Check for valid content length.
        int contentLength = connection.getContentLength();
        String contentType = connection.getContentType();
        System.out.println("length: "+contentLength+"Type: "+contentType);
    }

}