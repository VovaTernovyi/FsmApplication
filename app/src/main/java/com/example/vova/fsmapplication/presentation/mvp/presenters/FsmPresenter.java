package com.example.vova.fsmapplication.presentation.mvp.presenters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.vova.fsmapplication.domain.FsmItem;
import com.example.vova.fsmapplication.domain.FsmItems;
import com.example.vova.fsmapplication.presentation.mvp.holders.FsmViewHolder;
import com.example.vova.fsmapplication.presentation.mvp.models.FsmModel;
import com.example.vova.fsmapplication.presentation.mvp.views.FsmView;
import com.jakewharton.rxbinding.view.RxView;

/**
 * Created by vova on 04.06.17.
 */

public class FsmPresenter extends BasePresenter<FsmView, FsmModel, FsmViewHolder> {

    FsmItems mItems;

    private String mAlarmStatus = "AlarmDisarmed";
    private String mDoorsStatus = "AllLocked";

    public FsmPresenter() {
        setModel(new FsmModel());
    }

    @Override
    public void onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mItems = processGetFsm();
        getView().updateStatus(mDoorsStatus, mAlarmStatus);

        RxView.clicks(getViewHolder().getLockButton()).subscribe(aVoid -> doAction("LOCK"));
        RxView.clicks(getViewHolder().getLockX2Button()).subscribe(aVoid -> doAction("LOCKx2"));
        RxView.clicks(getViewHolder().getUnlockButton()).subscribe(aVoid -> doAction("UNLOCK"));
        RxView.clicks(getViewHolder().getUnlockX2Button()).subscribe(aVoid -> doAction("UNLOCKx2"));
    }

    private void doAction(String action) {
        for (FsmItem item : mItems.getFsmItem()) {
            if (item.getAction().equals(action)
                    && item.getStartDoorsState().equals(mDoorsStatus)
                    && item.getStartAlarmState().equals(mAlarmStatus)) {
                mAlarmStatus = item.getEndAlarmState();
                mDoorsStatus = item.getEndDoorsState();
                getView().updateStatus(mDoorsStatus, mAlarmStatus);
            }
        }
    }

    private FsmItems processGetFsm() {
        return getModel().getFsmStates();
    }


}
