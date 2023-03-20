package VGA;

import hdmi.HDMI;


public class VGA_HDMI_ADAPTATEUR {
    private HDMI hdmi;
    public void adaptateur( String c){
    byte[]b=c.getBytes();
     hdmi.printTV(b);
    }
}
