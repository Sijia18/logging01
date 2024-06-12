package co.develhope.logging.controllers;

import co.develhope.logging.services.ExpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ExpController {

    @Autowired
    ExpService expService;

    Logger logger = LoggerFactory.getLogger(ExpController.class);

    @GetMapping
    public String greeting() {
        logger.info("get greeting");
        return "Welcome";
    }

    @GetMapping("/exp")
    public int result() {
        logger.info("Start");
        int powResult = expService.result();
        logger.info("Finish");
        return powResult;
    }

    @GetMapping("/get-errors")
    public void errors(){
        logger.error("there is an error");
    }
}
