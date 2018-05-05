/**
 *
 * @author Jose Linares
 * @date 03/04/2018
 * 
 * Class: ConvertImage
 * Gets an image file and traverses through each pixel converting it into 
 * shapeclip compatible string. Uses shapeClipData object to store values.
 * Alpha is used to raise the height and if opaque
 * will raise the shapeclip to its value of around 255.
 * Uses ShapeClipData object to save data
 */
 

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;




public class ConvertImage extends Component {

      
  public ConvertImage(String img,ShapeClipData arr) throws IOException {
      
      // get the BufferedImage, using the ImageIO class

      BufferedImage image;
      image = ImageIO.read(this.getClass().getResource(img));
      marchThroughImage(image, arr);

  }
  /**
   * Adds a shapeclip element with RGBH values
   * @param pixel 
   */
  public void printPixelARGB(int pixel, ShapeClipData arr) {
    int alpha = (pixel >> 24) & 0xff;
    int red = (pixel >> 16) & 0xff;
    int green = (pixel >> 8) & 0xff;
    int blue = (pixel) & 0xff;
    //System.out.println("argb: " + alpha + ", " + red + ", " + green + ", " + blue);
    arr.addElement(red, green, blue, alpha);
  }
/**
 * Takes an image and loops through width and height of each pixel converting them
 * to RGB. We use the alpha value to give it height.
 * @param image 
 */
  private void marchThroughImage(BufferedImage image, ShapeClipData arr) {
    int w = image.getWidth();
    int h = image.getHeight();
   
    System.out.println("width, height: " + w + ", " + h);
    
    for (int i = 0; i < h; i++) {
       for (int j = 0; j < w; j++) {
     
        System.out.println("Processing Co-ordinate pixels x,y: " + j + ", " + i + " " + (float) ((i/h)*100) + "%");
        int pixel = image.getRGB(j, i);
        printPixelARGB(pixel, arr);
        //
      }
    }
  }
}

