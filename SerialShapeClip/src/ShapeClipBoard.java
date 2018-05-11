
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class ShapeClipBoard {

    ArrayList<ShapeClipData> shapeClipArray;
    public ShapeClipBoard(ShapeClipData sd)
    {
    
    }
    public ShapeClipBoard()
    {
       shapeClipArray = new ArrayList<ShapeClipData>();
    }
        
    
    /**
     * Gets the arraylist variable shapeClipArray
     * @return shapeClipArray
     */
    public ArrayList getShapeClipArray(){return shapeClipArray;}
    /**
     * Add a shapeclip element once it has passed checks
     *
     * @param red
     * @param green
     * @param blue
     * @param height
     * @return
     */
    public boolean addElement(int red, int green, int blue, int height, ShapeClipData sd) {
        if (sd.checkColourRange(red) && sd.checkColourRange(green) && sd.checkColourRange(blue) && sd.checkHeightRange(height)) {
            sd.setRed(red);
            sd.setGreen(green);
            sd.setBlue(blue);
            sd.setHeight(height);
            shapeClipArray.add(sd);
            return true;
        } else {
            return false;
        }
    }
    
   public boolean addElement(ShapeClipData sd) {
        if (sd.checkColourRange(sd.getRed()) && sd.checkColourRange(sd.getGreen()) && sd.checkColourRange(sd.getBlue()) && sd.checkHeightRange(sd.getHeight())) {
            shapeClipArray.add(sd);
            return true;
        } else {
            return false;
        }
    }    
    /**
 * Converts the elements of the shapecliparray and returns them as a string 
 * representation so that it can be sent to the shapeclip
 * @return str
 */
    public String getShapeClipArrayString()
    {
        String str = "F";
        for(ShapeClipData scd : shapeClipArray){
            str += scd.getRed()+","+scd.getGreen()+","+scd.getBlue()+","+scd.getHeight()+"X";
        }
        return str;
    }
    
}
    

