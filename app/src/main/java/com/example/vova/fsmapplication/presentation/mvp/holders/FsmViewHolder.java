package com.example.vova.fsmapplication.presentation.mvp.holders;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vova on 04.06.17.
 */

public class FsmViewHolder {

    private ImageView mImageGreen;
    private ImageView mImageRed;
    private TextView mStatusTextView;
    private Button mLockButton;
    private Button mLockX2Button;
    private Button mUnlockButton;
    private Button mUnlockX2Button;

    public FsmViewHolder(ImageView imageGreen, ImageView imageRed,
                         TextView statusTextView, Button lockButton,
                         Button lockX2Button, Button unlockButton, Button unlockX2Button) {

        mImageGreen = imageGreen;
        mImageRed = imageRed;
        mStatusTextView = statusTextView;
        mLockButton = lockButton;
        mLockX2Button = lockX2Button;
        mUnlockButton = unlockButton;
        mUnlockX2Button = unlockX2Button;
    }

    public ImageView getImageGreen() {
        return mImageGreen;
    }

    public void setImageGreen(ImageView imageGreen) {
        mImageGreen = imageGreen;
    }

    public ImageView getImageRed() {
        return mImageRed;
    }

    public void setImageRed(ImageView imageRed) {
        mImageRed = imageRed;
    }

    public TextView getStatusTextView() {
        return mStatusTextView;
    }

    public void setStatusTextView(TextView statusTextView) {
        mStatusTextView = statusTextView;
    }

    public Button getLockButton() {
        return mLockButton;
    }

    public void setLockButton(Button lockButton) {
        mLockButton = lockButton;
    }

    public Button getLockX2Button() {
        return mLockX2Button;
    }

    public void setLockX2Button(Button lockX2Button) {
        mLockX2Button = lockX2Button;
    }

    public Button getUnlockButton() {
        return mUnlockButton;
    }

    public void setUnlockButton(Button unlockButton) {
        mUnlockButton = unlockButton;
    }

    public Button getUnlockX2Button() {
        return mUnlockX2Button;
    }

    public void setUnlockX2Button(Button unlockX2Button) {
        mUnlockX2Button = unlockX2Button;
    }
}
