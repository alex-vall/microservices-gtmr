package com.vall.jackpotservice.model;

/**
 *
 * Created by Vall on 07.10.2016.
 */
public class JackpotServiceResult {

    private final double jackpotAmount;

    private final double winJackpotAmount;

    public JackpotServiceResult(double jackpotAmount, double winJackpotAmount) {
        this.jackpotAmount = jackpotAmount;
        this.winJackpotAmount = winJackpotAmount;
    }

    public double getJackpotAmount() {
        return jackpotAmount;
    }

    public double getWinJackpotAmount() {
        return winJackpotAmount;
    }
}
