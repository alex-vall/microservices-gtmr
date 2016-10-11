package com.vall.gameservice.service;

import com.vall.gameservice.model.JackpotServiceResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Created by Vall on 11.10.2016.
 */


public class JackpotServiceClientFallback implements JackpotServiceClient {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    public JackpotServiceResult getJackpot(Double bet) {
        log.warn("Fallback called!");
        return new JackpotServiceResult(-1, -1);
    }
}
