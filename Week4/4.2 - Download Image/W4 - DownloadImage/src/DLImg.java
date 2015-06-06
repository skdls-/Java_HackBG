import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class DLImg {

    public static void main(String[] args) throws IOException {
        /*Scanner a = new Scanner(System.in);
        String imageUrl = a.next();
        a.close();
        
        Scanner b = new Scanner(System.in);
        String destinationFile = b.next();
        b.close(); */
        
        saveImage("http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg", "/home/rolev/");
    }

    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
        URL url = new URL(imageUrl);
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destinationFile + "MYImg");
        byte[] space= new byte[1024];
        int length;

        while ((length = is.read(space)) != -1) {
            os.write(space, 0, length);
            }
        
        is.close();
        os.close();
    }
}
