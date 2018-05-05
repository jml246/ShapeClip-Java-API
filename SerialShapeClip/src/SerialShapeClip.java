/*
   SerialShapeClip is a wrapper class that enables communications on the 
serial port API. It automatically detects an arduino device so make sure you only
have one plugged in at the same time.

 
 * @author Jose Linares
 * @date 03/04/2018
 */


import com.fazecast.jSerialComm.*;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class SerialShapeClip {

    private SerialPort comPort;

    public SerialShapeClip() {
        this.comPort = null;

    }
    

/**
 * Opens communications with the shapeclip and detects for arduino descriptors
 * 
 * 
 */    
    public void shapeClipOpen() {
               
       
        // TODO code application logic here
        if(SerialPort.getCommPorts().length > 0)
        {
            for(int i = 0;i < SerialPort.getCommPorts().length;i++)
            {
                boolean b = SerialPort.getCommPorts()[i].getDescriptivePortName().contains("Arduino");
               if(b)
               {
                  comPort = SerialPort.getCommPorts()[i];
               }
               else
               {
                  System.out.println("Arduino device not found");
                  System.exit(0);
               }
            }
        }
        else
        {
            System.out.println("No com ports detected");
            System.exit(0);
        }
        comPort.setBaudRate(9600);
        comPort.openPort();
//comPort.setFlowControl(SerialPort.FLOW_CONTROL_DISABLED);
//comPort.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 1000);


/*comPort.addDataListener(new SerialPortDataListener() {
   @Override
   public int getListeningEvents() { return SerialPort.LISTENING_EVENT_DATA_WRITTEN; }
   @Override
   public void serialEvent(SerialPortEvent event)
   {
      if (event.getEventType() == SerialPort.LISTENING_EVENT_DATA_WRITTEN)
         System.out.println("All bytes were successfully transmitted!");
   }
});
*/
    }
/**
 * Closes the serial connection
 */
    public void shapeClipClose() {
        comPort.clearRTS();
        comPort.closePort();
    }
/**
 * Sends string data converted to byte format
 * @param str 
 */
    public void shapeClipSend(String str) {
        comPort.clearBreak();
        comPort.setRTS();
        comPort.writeBytes(str.getBytes(),str.length());
        comPort.clearBreak();
    }




} 

