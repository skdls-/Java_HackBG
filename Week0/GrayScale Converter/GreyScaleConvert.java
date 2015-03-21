import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;


public class GreyScaleConvert {
    
        public void convertGrey(String path)
        {
            try
            {
                BufferedImage img = ImageIO.read(new File(path));
                BufferedImage gray = new BufferedImage(img.getWidth(), img.getHeight(),
                        BufferedImage.TYPE_BYTE_GRAY);

                Graphics2D g = gray.createGraphics();
                g.drawImage(img, 0, 0, null);
                
                ImageIO.write(gray, "png", new File(path));

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            
            System.out.println("Type the address of the picture they you want to convert: ");
            
            Scanner scan = new Scanner (System.in);
            String path = scan.nextLine();
            
            System.out.println(path);
            
            GreyScaleConvert myImage = new GreyScaleConvert();
            myImage.convertGrey(path);
            
        }
}