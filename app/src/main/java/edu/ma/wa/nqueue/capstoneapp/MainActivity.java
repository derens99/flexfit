package edu.ma.wa.nqueue.capstoneapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button Exercises, findFriends, Options;

    public void init(){
        Exercises = (Button)findViewById(R.id.excersise);
        findFriends = (Button)findViewById(R.id.friends);
        Options = (Button)findViewById(R.id.options);
    }

    public void buttonClicked(View v){
        if((Button)v == Exercises){

        }
        else if((Button)v == findFriends){

        }
        else if((Button)v == Options){

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Typeface title = Typeface.createFromAsset(getAssets(), "PWPerspective.ttf");
        Typeface buttons = Typeface.createFromAsset(getAssets(), "Cheveuxdange.ttf");
        TextView titleview = (TextView)findViewById(R.id.textviewtitle);
        TextView buttonview = (TextView)findViewById(R.id.excersise);
        TextView button2view = (TextView)findViewById(R.id.friends);
        TextView button3view = (TextView)findViewById(R.id.options);
        titleview.setTypeface(title);
        buttonview.setTypeface(buttons);
        button2view.setTypeface(buttons);
        button3view.setTypeface(buttons);
    }
}
