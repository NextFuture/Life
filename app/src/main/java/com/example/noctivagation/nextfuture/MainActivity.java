package com.example.noctivagation.nextfuture;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String ACTIVITY_MODEA= "com.example.module.ModuleMainactivity";
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    private void init(){
        findViewById(R.id.btn_module).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    context=MainActivity.this;
                    Intent intent = new Intent();
                    Class clazz = Class.forName(ACTIVITY_MODEA);
                    intent.setClass(context,clazz);
                    startActivity(intent);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
