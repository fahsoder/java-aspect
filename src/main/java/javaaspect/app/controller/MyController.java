package javaaspect.app.controller;

import javaaspect.app.service.MyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private final MyService myService;

    @GetMapping("/default-log")
    public void defaultLog() {
        myService.defaultLog();
    }

    @GetMapping("/info-log")
    public void infoLog() {
        myService.infoLog();
    }

    @GetMapping("/warn-log")
    public void warnLog() {
        myService.warnLog();
    }

    @GetMapping("/error-log")
    public void errorLog() {
        myService.errorLog();
    }
}
