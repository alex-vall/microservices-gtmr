package com.vall.jackpotservice.controller;

import com.google.common.util.concurrent.AtomicDouble;
import com.vall.jackpotservice.model.JackpotServiceResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


/**
 *
 * Created by Vall on 07.10.2016.
 */

@RestController
public class JackpotServiceController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private AtomicDouble jackPotAmount = new AtomicDouble(1000.00);

    @ResponseBody
    @RequestMapping(value = "/getJackpot", method = RequestMethod.GET)
    public JackpotServiceResult checkJackpot(@RequestParam(value = "bet") Double bet) {

        log.info("/getJackpot called with bet: " + bet);

        return new JackpotServiceResult(jackPotAmount.addAndGet(bet), 0.00d);
    }



}
