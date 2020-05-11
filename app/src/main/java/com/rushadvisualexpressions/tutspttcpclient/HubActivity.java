package com.rushadvisualexpressions.tutspttcpclient;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
        etIP = findViewById(R.id.etIP);
        etPort = findViewById(R.id.etPort);
        btStart = findViewById(R.id.btStart);
        btStop = findViewById(R.id.btStop);

    }

    Thread Thread1 = null;
    EditText etIP, etPort;
    String SERVER_IP;
    int SERVER_PORT;
    Button btStart;
    Button btStop;

    Button btScene_01;
    Button btScene_02;
    Button btScene_03;
    Button btScene_04;
    Button btScene_05;
    Button btScene_06;

    Button btCut_01;
    Button btCut_02;
    Button btCut_03;
    Button btCut_04;
    Button btCut_05;
    Button btCut_06;
}
