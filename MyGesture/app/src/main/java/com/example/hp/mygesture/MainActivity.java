package com.example.hp.mygesture;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView myText;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText=(TextView)findViewById(R.id.myText);
        this.gestureDetector=new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        myText.setText("onDown");

        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        myText.setText(getString(R.string.onShow));

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        myText.setText("SingleTapUp");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        myText.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        myText.setText("onFling");

        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        myText.setText("SingleTapConfirmed");

        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        myText.setText("ondoubletap");

        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        myText.setText("ondoubleTapEvent");

        return false;
    }
}
