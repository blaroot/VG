import USB.USB;
import VGA.VGA;
public class UC {

    private USB usb;
    private VGA vga;
    public int ReadData(){
       int d= usb.read();
       return d;
    }
    public void printData(String data){
   vga.printD(data);
    }
   };
