package com.vall.gameservice.model;


/**
 *
 * Created by Vall on 05.10.2016.
 */


public class GameServiceResult {

    private final int status;

    private final Double win;

    private final Double jackpot;

    public GameServiceResult(int status, Double win, Double jackpot) {
        this.status = status;
        this.win = win;
        this.jackpot = jackpot;
    }

    public int getStatus() {
        return status;
    }

    public Double getWin() {
        return win;
    }

    public Double getJackpot() {
        return jackpot;
    }

    @Override
    public String toString() {
        return "GameServiceResult{" +
                "status=" + status +
                ", win=" + win +
                ", jackpot=" + jackpot +
                '}';
    }
}
