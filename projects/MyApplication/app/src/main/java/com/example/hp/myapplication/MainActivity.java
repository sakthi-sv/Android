package com.example.hp.myapplication;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton =new Button(this);
        myButton.setText("Click Here");
        myButton.setBackgroundColor(Color.BLUE);
        myLayout.setBackgroundColor(Color.GREEN);

        RelativeLayout.LayoutParams buttondetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        buttondetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttondetails.addRule(RelativeLayout.CENTER_VERTICAL);
        myLayout.addView(myButton,buttondetails);

        EditText UserName=new EditText(this);
        myButton.setId(1);
        UserName.setId(2);

        RelativeLayout.LayoutParams usernamedetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        usernamedetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        usernamedetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        Resources r = getResources();
        int px=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        UserName.setWidth(px);
        usernamedetails.setMargins(0,0,0,50);
        myLayout.addView(UserName,usernamedetails);


        setContentView(myLayout);
    }

}
