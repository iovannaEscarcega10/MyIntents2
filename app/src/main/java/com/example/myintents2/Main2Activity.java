package com.example.myintents2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1 = findViewById(R.id.txtnombre);

        //Por método Bundle
        //Bundle bt = new Bundle();
        Bundle bt = getIntent().getExtras();
        String px = bt.getString("Nombre");





        //Sin Bundle
        /*String rt = getIntent().getStringExtra("Nombre");
        //String rt = getIntent().getExtras().getString("Nombre");
        txt1.setText(rt);*/
    }
}
