package test.converter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagesConverter {
    public static void main(String[] args) {
        BufferedImage image = null;
        try {
            File file = new File("333369.jpg");
            image = ImageIO.read(file);
            ImageIO.write(image, "333369.webp", new File("output.webp"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
