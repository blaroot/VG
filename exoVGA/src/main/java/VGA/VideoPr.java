package VGA;

import org.springframework.stereotype.Component;
@Component
public class VideoPr implements VGA{

    public void printD(String message) {
        System.out.println(message);
    }



}
