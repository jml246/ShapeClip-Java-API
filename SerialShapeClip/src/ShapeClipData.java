import java.util.ArrayList;

/**
 * ShapeClipData class that holds data that each shapeclip would use
 * Has also an arraylist variable to store elements to send them through more shapeclips
 * 
 * @author Jose Linares
 * @date 03/04/2018
 */
class ShapeClipData {
    private int red,green,blue,height;

    /**
     * Constructor for class
     */
    public ShapeClipData(int red,int green,int blue,int height)
    {
      this.blue = blue;
      this.red = red;
      this.green = green;
      this.height = height;
        
    }
    public ShapeClipData()
    {
      
        
    }
    
    /**
     * Getter for red colour
     * @return red
     */
    public int getRed(){return red;}
    /**
     * Getter for green colour
     * @return green 
     */
    public int getGreen(){return green;}
    /**
     * Getter for blue colour
     * @return blue
     */
    public int getBlue(){return blue;}
    /**
     * Getter for height
     * @return height
     */
    public int getHeight(){return height;}

    /**
     * Setter for red
     * @param red 
     */
    public void setRed(int red){this.red = red;}
    /**
     * Setter for green
     * @param green 
     */
    public void setGreen(int green){this.green = green;}
    /**
     * Setter for blue
     * @param blue 
     */
    public void setBlue(int blue){this.blue = blue;}
    /**
     * Setter for height
     * @param height 
     */
    public void setHeight(int height){this.height = height;}
    /**
     * Checks for colour ranges as accepted by the firmware.
     * If values exist and are within bounds, then send boolean true, 
     * else return false 
     * @param col
     * @return boolean 
     */
    public boolean checkColourRange(int col){
        if(col >= 0 && col <= 255){return true;}else{return false;}
    }
    /**
     * Check the height range and value exist
     * @param col
     * @return boolean
     */
    public boolean checkHeightRange(int height){
        if(height >= 0 && height <= 470){return true;}else{return false;}
    }

}

