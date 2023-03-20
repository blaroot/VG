package VGA;

import hdmi.HDMI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringAD {
    ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
    HDMI hdmi=(HDMI) context.getBean("hdmi");
}

