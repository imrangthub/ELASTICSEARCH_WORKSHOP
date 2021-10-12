package com.imranmadbar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

@RestController
class HomeController {

    final static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/")
    public String helloWorld() {
        String response = "Welcome to ELK CRUD: " + new Date();
        logger.info(response);
        return response;
    }

    @RequestMapping(value = "/exc")
    public String exception() {
        String response = "";
        try {
            throw new Exception("A simple Exception occur !");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.toString());
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String stackTrace = sw.toString();
            logger.error("Exception - " + stackTrace);
            response = stackTrace;
        }

        return response;
    }
}