package com.example.vova.fsmapplication.presentation.ui.activities;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vova.fsmapplication.R;
import com.example.vova.fsmapplication.presentation.ui.fragments.FsmFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openFsmFragment();
    }

    /**
     * Open FSM_Fragment.
     */
    public void openFsmFragment() {
        Fragment frag = getFragmentManager().findFragmentById(R.id.content_frame);
        FragmentTransaction ft = getFragmentManager().beginTransaction();

        if (frag != null && frag instanceof FsmFragment) {
            ft.attach(frag);
        } else {
            frag = new FsmFragment();
            ft.replace(R.id.content_frame, frag);
        }

        ft.commit();
    }
}
