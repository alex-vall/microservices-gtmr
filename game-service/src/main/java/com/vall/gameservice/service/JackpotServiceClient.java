package com.vall.gameservice.service;

import com.vall.gameservice.model.JackpotServiceResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * Created by Vall on 08.10.2016.
 */

@FeignClient(value = "jackpot-service", fallback = JackpotServiceClientFallback.class)
//@FeignClient(value = "jackpot-service")
public interface JackpotServiceClient {

    @RequestMapping(value = "/getJackpot", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    JackpotServiceResult getJackpot(@RequestParam(value = "bet") Double bet);

}
