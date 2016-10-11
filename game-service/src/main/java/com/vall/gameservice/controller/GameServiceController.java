package com.vall.gameservice.controller;

import com.vall.gameservice.model.GameServiceResult;
import com.vall.gameservice.model.JackpotServiceResult;
import com.vall.gameservice.service.JackpotServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by Vall on 05.10.2016.
 */

@RestController
public class GameServiceController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());


    private JackpotServiceClient jackpotServiceClient;

    @Autowired
    public GameServiceController(JackpotServiceClient jackpotServiceClient) {
        this.jackpotServiceClient = jackpotServiceClient;
    }

    @RequestMapping(value = "/doPlay", method = RequestMethod.GET)
    public @ResponseBody GameServiceResult doPlay() {

        final double win = 50.0d;

        log.info("/doPlay called");

        JackpotServiceResult jackpotServiceResult = jackpotServiceClient.getJackpot(10.0d);

        return new GameServiceResult(0, win, jackpotServiceResult.getJackpotAmount());
    }

}
