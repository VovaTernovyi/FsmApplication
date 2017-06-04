package com.example.vova.fsmapplication.presentation.ui.fragments;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vova.fsmapplication.R;
import com.example.vova.fsmapplication.databinding.FragmentFsmBinding;
import com.example.vova.fsmapplication.presentation.mvp.holders.FsmViewHolder;
import com.example.vova.fsmapplication.presentation.mvp.presenters.FsmPresenter;
import com.example.vova.fsmapplication.presentation.mvp.views.FsmView;

public class FsmFragment extends Fragment implements FsmView {

    private FragmentFsmBinding mBinding;
    private FsmViewHolder mViewHolder;
    private FsmPresenter mPresenter;

    public FsmFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_fsm, container, false);

        mViewHolder = new FsmViewHolder(mBinding.imageGreen, mBinding.imageRed, mBinding.textViewStatus,
                mBinding.buttonLock, mBinding.buttonLockX2, mBinding.buttonUnlock, mBinding.buttonUnlockX2);

        mPresenter = new FsmPresenter();
        mPresenter.init(this, mViewHolder);
        mPresenter.onCreate(inflater, container, savedInstanceState);

        return mBinding.getRoot();
    }

    @Override
    public void updateStatus(String doors, String alarm) {
        if (doors.equals("AllUnlocked") && alarm.equals("AlarmDisarmed")) {
            mBinding.textViewStatus.setText(doors + "_" + alarm);
            mBinding.imageGreen.setVisibility(View.VISIBLE);
            mBinding.imageRed.setVisibility(View.INVISIBLE);
        } else if (doors.equals("AllLocked") && alarm.equals("AlarmDisarmed")) {
            mBinding.textViewStatus.setText(doors + "_" + alarm);
            mBinding.imageGreen.setVisibility(View.VISIBLE);
            mBinding.imageRed.setVisibility(View.INVISIBLE);
        } else if (doors.equals("AllLocked") && alarm.equals("AlarmArmed")) {
            mBinding.textViewStatus.setText(doors + "_" + alarm);
            mBinding.imageGreen.setVisibility(View.INVISIBLE);
            mBinding.imageRed.setVisibility(View.VISIBLE);
        } else if (doors.equals("DriverUnlocked") && alarm.equals("AlarmDisarmed")) {
            mBinding.textViewStatus.setText(doors + "_" + alarm);
            mBinding.imageGreen.setVisibility(View.VISIBLE);
            mBinding.imageRed.setVisibility(View.INVISIBLE);
        }
    }
}
