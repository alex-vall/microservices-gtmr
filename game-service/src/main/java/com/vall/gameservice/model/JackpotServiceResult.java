package com.vall.gameservice.model;

/**
 *
 * Created by Vall on 07.10.2016.
 */
public class JackpotServiceResult {

    private double jackpotAmount;

    private double winJackpotAmount;

    public JackpotServiceResult(double jackpotAmount, double winJackpotAmount) {
        this.jackpotAmount = jackpotAmount;
        this.winJackpotAmount = winJackpotAmount;
    }

    public JackpotServiceResult() {
    }

    public double getJackpotAmount() {
        return jackpotAmount;
    }

    public double getWinJackpotAmount() {
        return winJackpotAmount;
    }

    public void setJackpotAmount(double jackpotAmount) {
        this.jackpotAmount = jackpotAmount;
    }

    public void setWinJackpotAmount(double winJackpotAmount) {
        this.winJackpotAmount = winJackpotAmount;
    }
}
