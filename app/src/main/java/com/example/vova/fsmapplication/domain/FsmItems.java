package com.example.vova.fsmapplication.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by vova on 04.06.17.
 */

public class FsmItems implements Serializable {

    @SerializedName("fsm_item")
    @Expose
    private List<FsmItem> fsmItem = null;
    private final static long serialVersionUID = 1749121404712258324L;

    public List<FsmItem> getFsmItem() {
        return fsmItem;
    }

    public void setFsmItem(List<FsmItem> fsmItem) {
        this.fsmItem = fsmItem;
    }
}
