package javaaspect.app.service;

import javaaspect.app.aspect.annotation.LogInterface;
import javaaspect.app.model.LogTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @LogInterface
    public void defaultLog() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogInterface(value = "This is a example of info log", type = LogTypeEnum.INFO)
    public void infoLog() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogInterface(value = "This is a example of warn log", type = LogTypeEnum.WARN)
    public void warnLog() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogInterface(value = "This is a example of error log", type = LogTypeEnum.ERROR)
    public void errorLog() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
