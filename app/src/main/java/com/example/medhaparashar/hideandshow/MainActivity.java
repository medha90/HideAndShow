package com.example.medhaparashar.hideandshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if ((getIntent().getFlags() & android.content.Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0 & getIntent().getExtras() == null) {
            finish();
            return;
        }
        //For Hide and show image when button is clicked
        android.widget.Button testButton = (android.widget.Button) findViewById(R.id.button);
        testButton.setOnClickListener(new android.view.View.OnClickListener() {
            // @Override
            public void onClick(android.view.View v) {
                String curText = (String) ((android.widget.Button) v).getText();
                if (curText.equals("HIDE")) {
                    ((android.widget.Button) v).setText("SHOW");
                    android.widget.ImageView iv = (android.widget.ImageView) findViewById(R.id.medha);
                    iv.setVisibility(android.view.View.GONE);
                } else if (curText.equals("SHOW")) {
                    ((android.widget.Button) v).setText("HIDE");
                    android.widget.ImageView iv = (android.widget.ImageView) findViewById(R.id.medha);
                    iv.setVisibility(android.view.View.VISIBLE);

                }
            }
        });

    }
}
