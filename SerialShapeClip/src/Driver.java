
import java.io.IOException;
import java.util.ArrayList;

/*
 Java driver that uses the ShapeClip Java API to send data to the shapeclips.
 This driver shows examples of how to use the API on to your Java ShapeClip
 project.
 */

/**
 *
 * @author Jose Linares
 * @date 03/04/2018
 */
public class Driver implements ShapeClipAPI{
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Example usage to send data to a shapeClip
        SerialShapeClip sh;
        
        sh = new SerialShapeClip();
    
        //we open the port
        sh.shapeClipOpen();
        ShapeClipBoard sb = new ShapeClipBoard();

        //create a new element with values - if inputs are fine, then it will add 
        // the new element and print ok
         if(sb.addElement(new ShapeClipData(25,10,255,350))){System.out.println("OK");}else{System.out.println("Error");};
        if(sb.addElement(new ShapeClipData(25,255,70,75))){System.out.println("OK");}else{System.out.println("Error");};

       //print out our array into a string
        //System.out.println(sd.getShapeClipArrayString());
        //pass the array as a string and send it via serial comms
       // sh.shapeClipSend(sd.getShapeClipArrayString());
        
         //Process an image and send it off to the shapeclip
        //sh.shapeClipSend(sh.shapeClipProcessImage("1x8.png"));
       
        
        //if you want more access to an image use the ConvertImage object
        //new ConvertImage("1x8.png",sb,sd);
        //new ConvertImage("red_blue.png",sd);
        //new ConvertImage("3x3.gif",sd);
        sh.shapeClipSend(sb.getShapeClipArrayString());
        System.out.println(sb.getShapeClipArrayString());
        
        //close the shapeclip
        sh.shapeClipClose();
        
    
    }  

    @Override
    public void shapeClipOpen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shapeClipClose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shapeClipSend(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String shapeClipProcessImage(String img) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getGreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBlue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRed(int red) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGreen(int green) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBlue(int blue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHeight(int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addElement(int red, int green, int blue, int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getShapeClipArrayString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList getShapeClipArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
