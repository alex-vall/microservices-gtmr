package com.vall.gameservice.controller;

import com.vall.gameservice.model.GameServiceResult;
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

    @RequestMapping(value = "/doPlay", method = RequestMethod.GET)
    public @ResponseBody GameServiceResult doPlay() {
        return new GameServiceResult(0, 50.0d);
    }

}
