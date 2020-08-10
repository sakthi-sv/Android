package com.example.hp.myevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LoginButton=(Button)findViewById(R.id.LoginButton);
        LoginButton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView myText=(TextView)findViewById(R.id.UserDetails);
                        myText.setText("Button Clicked");
                    }
                }
                );

        LoginButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View v) {
                        TextView myText=(TextView)findViewById(R.id.UserDetails);
                        myText.setText("Long Pressed");
                        return true;
                    }
                }
        );


    }
}
