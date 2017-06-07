package com.example.vova.fsmapplication.presentation.mvp.models;

import com.example.vova.fsmapplication.AppCore;
import com.example.vova.fsmapplication.R;
import com.example.vova.fsmapplication.domain.FSM;
import com.example.vova.fsmapplication.domain.FsmItems;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by vova on 04.06.17.
 */

public class FsmModel {

    public FsmItems getFsmStates() {

        String jsonString = readJson();

        Gson gson = new Gson();
        FSM fsm = gson.fromJson(jsonString, FSM.class);

        return fsm.getFsmItems();
    }

    public String readJson() {
        InputStream is = AppCore.getInstance().getResources().openRawResource(R.raw.fsm);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(is));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String jsonString = writer.toString();

        return jsonString;
    }
}
