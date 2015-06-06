import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import com.nitido.utils.toaster.Toaster;


public class JtoasterApp {


    public static void main(String[] args) {
        
       BufferedImage img = null;
        try {
            img = ImageIO.read(new File("strawberry.jpg"));
        } catch (IOException e) {
        } 
        
        Toaster toasterManager = new Toaster();
        
        toasterManager.setToasterWidth(400);
        toasterManager.setToasterHeight(400);
        toasterManager.setBackgroundImage(img);
        toasterManager.showToaster( "Hello World!" );
        toasterManager.setDisplayTime(10);
    }
}
