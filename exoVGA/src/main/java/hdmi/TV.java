package hdmi;

import org.springframework.stereotype.Component;

@Component
public class TV implements HDMI{


    public byte[] printTV(byte[] data) {
        return data;
    }
}
