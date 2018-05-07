package com.ronakgune.wikiview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAndroid(View v) {
        String android = "Android_(operating_system)";


        Intent intent = new Intent(getBaseContext(), WikiS.class);
        intent.putExtra("WikiS", android);
        startActivity(intent);
    }
    public void onClickBART(View v) {
        String bart = "BART";


        Intent intent = new Intent(getBaseContext(), WikiS.class);
        intent.putExtra("WikiS", bart);
        startActivity(intent);
    }
    public void onClickSCU(View v) {
        String scu = "Santa_Clara_University";


        Intent intent = new Intent(getBaseContext(), WikiS.class);
        intent.putExtra("WikiS", scu);
        startActivity(intent);

    }
    public void onClickKotlin(View v) {
        String kotlin = "Kotlin_(programming_language)";


        Intent intent = new Intent(getBaseContext(), WikiS.class);
        intent.putExtra("WikiS", kotlin);
        startActivity(intent);

    }
    public void onClickAmazon(View v) {
        String Amazon = "Amazon_(company)";


        Intent intent = new Intent(getBaseContext(), WikiS.class);
        intent.putExtra("WikiS", Amazon);
        startActivity(intent);

    }
    public void onClickVTA(View v) {
        String vta = "Santa_Clara_Valley_Transportation_Authority";


        Intent intent = new Intent(getBaseContext(), WikiS.class);
        intent.putExtra("WikiS", vta);
        startActivity(intent);
    }



}
