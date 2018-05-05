
import java.util.ArrayList;




/**
 * ShapeClip interface 
 *  * @author Jose Linares
 * @date 03/04/2018
 */
public interface ShapeClipAPI {
    
    public void shapeClipOpen();
    public void shapeClipClose();
    public void shapeClipSend(String str);
    public String shapeClipProcessImage(String img);  

    public int getRed();
    public int getGreen();
    public int getBlue();
    public int getHeight();
    
    public void setRed(int red);
    public void setGreen(int green);
    public void setBlue(int blue);
    public void setHeight(int height);
    
    public boolean addElement(int red,int green,int blue,int height);
    public String getShapeClipArrayString();
    public ArrayList getShapeClipArray();
    
    
}
