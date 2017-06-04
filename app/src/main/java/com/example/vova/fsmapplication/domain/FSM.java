package com.example.vova.fsmapplication.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by vova on 04.06.17.
 */

public class FSM implements Serializable {

    @SerializedName("fsm_items")
    @Expose
    private FsmItems fsmItems;
    private final static long serialVersionUID = 1206392226721559197L;

    public FsmItems getFsmItems() {
        return fsmItems;
    }

    public void setFsmItems(FsmItems fsmItems) {
        this.fsmItems = fsmItems;
    }
}
