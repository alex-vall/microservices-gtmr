package com.vall.jackpotservice.controller;

import com.vall.jackpotservice.model.JackpotServiceResult;
import org.springframework.web.bind.annotation.*;

/**
 *
 * Created by Vall on 07.10.2016.
 */

@RestController
public class JackpotServiceController {

    @ResponseBody
    @RequestMapping(value = "/getJackpot", method = RequestMethod.GET)
    public JackpotServiceResult checkJackpot(@RequestParam(value = "bet") Double bet) {
        return new JackpotServiceResult(1000.00d, 0.00d);
    }



}
