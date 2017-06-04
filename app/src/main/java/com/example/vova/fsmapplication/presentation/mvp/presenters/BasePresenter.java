package com.example.vova.fsmapplication.presentation.mvp.presenters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by vova on 04.06.17.
 */

public class BasePresenter<V, M, H> implements IBasePresenter {

    private CompositeSubscription mSubscriptions;

    private V mView;

    private M mModel;

    private H mViewHolder;

    protected V getView() {
        return mView;
    }

    public void setView(V view) {
        mView = view;
    }

    protected M getModel() {
        return mModel;
    }

    public void setModel(M model) {
        mModel = model;
    }

    public H getViewHolder() {
        return mViewHolder;
    }

    public void setViewHolder(H viewHolder) {
        mViewHolder = viewHolder;
    }

    public BasePresenter() {
    }

    public void init(V view, H viewHolder) {
        mView = view;
        mViewHolder = viewHolder;
    }

    protected CompositeSubscription getSubscriptions() {
        if (mSubscriptions == null) {
            mSubscriptions = new CompositeSubscription();
        }

        return mSubscriptions;
    }

    @Override
    public void onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
        unsubscribe();
    }

    @Override
    public void onDestroy() {
        mView = null;
        unsubscribe();
    }

    private void unsubscribe() {
        if (mSubscriptions != null && !mSubscriptions.isUnsubscribed()) {
            mSubscriptions.unsubscribe();
            mSubscriptions = null;
        }
    }
}
