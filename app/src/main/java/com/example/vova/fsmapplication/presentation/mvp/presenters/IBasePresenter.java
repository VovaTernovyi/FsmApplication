package com.example.vova.fsmapplication.presentation.mvp.presenters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by vova on 04.06.17.
 */

public interface IBasePresenter {

    void onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    void onResume();

    void onPause();

    void onDestroy();
}
