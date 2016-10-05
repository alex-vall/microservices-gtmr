package com.vall.gameservice.model;


/**
 *
 * Created by Vall on 05.10.2016.
 */


public class GameServiceResult {

    private final int status;

    private final Double win;

    public GameServiceResult(int status, Double win) {
        this.status = status;
        this.win = win;
    }

    public int getStatus() {
        return status;
    }

    public Double getWin() {
        return win;
    }
}
