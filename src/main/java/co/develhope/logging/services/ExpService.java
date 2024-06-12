package co.develhope.logging.services;

import co.develhope.logging.controllers.ExpController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExpService {
    @Value("${environment1}")
    private int environment1;
    @Value("${environment2}")
    private int environment2;

    Logger logger = LoggerFactory.getLogger(ExpController.class);

    public int result() {
        logger.info("Start");
        int powResult = (int) Math.pow(environment1, environment2);
        logger.info("Finish");
        return powResult;
    }
}
