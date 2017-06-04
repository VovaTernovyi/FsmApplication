package com.example.vova.fsmapplication.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by vova on 04.06.17.
 */

public class FsmItem implements Serializable {

    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("start_doors_state")
    @Expose
    private String startDoorsState;
    @SerializedName("start_alarm_state")
    @Expose
    private String startAlarmState;
    @SerializedName("end_doors_state")
    @Expose
    private String endDoorsState;
    @SerializedName("end_alarm_state")
    @Expose
    private String endAlarmState;
    private final static long serialVersionUID = -3623080885814339575L;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getStartDoorsState() {
        return startDoorsState;
    }

    public void setStartDoorsState(String startDoorsState) {
        this.startDoorsState = startDoorsState;
    }

    public String getStartAlarmState() {
        return startAlarmState;
    }

    public void setStartAlarmState(String startAlarmState) {
        this.startAlarmState = startAlarmState;
    }

    public String getEndDoorsState() {
        return endDoorsState;
    }

    public void setEndDoorsState(String endDoorsState) {
        this.endDoorsState = endDoorsState;
    }

    public String getEndAlarmState() {
        return endAlarmState;
    }

    public void setEndAlarmState(String endAlarmState) {
        this.endAlarmState = endAlarmState;
    }
}
