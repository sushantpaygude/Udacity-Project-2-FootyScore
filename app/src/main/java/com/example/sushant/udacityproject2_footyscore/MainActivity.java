package com.example.sushant.udacityproject2_footyscore;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button goalA,offsideA,foulA,goalB,offsideB,foulB,resetAll;
    TextView textView_goalA,textView_offsideA,textView_foulA,textView_goalB,textView_offsideB,textView_foulB,textView_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        goalA=(Button)findViewById(R.id.button_goal_a);
        offsideA=(Button)findViewById(R.id.button_offside_a);
        foulA=(Button)findViewById(R.id.button_foul_a);

        goalB=(Button)findViewById(R.id.button_goal_b);
        offsideB=(Button)findViewById(R.id.button_offside_b);
        foulB=(Button)findViewById(R.id.button_foul_b);

        resetAll=(Button)findViewById(R.id.button_reset);

        textView_goalA=(TextView)findViewById(R.id.text_goal_a);
        textView_offsideA=(TextView)findViewById(R.id.text_offside_a);
        textView_foulA=(TextView)findViewById(R.id.text_foul_a);

        textView_goalB=(TextView)findViewById(R.id.text_goal_b);
        textView_offsideB=(TextView)findViewById(R.id.text_offside_b);
        textView_foulB=(TextView)findViewById(R.id.text_foul_b);

        textView_title=(TextView)findViewById(R.id.text_title);
        goalA.setOnClickListener(this);
        offsideA.setOnClickListener(this);
        foulA.setOnClickListener(this);

        goalB.setOnClickListener(this);
        offsideB.setOnClickListener(this);
        foulB.setOnClickListener(this);

        resetAll.setOnClickListener(this);

        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/emporo.ttf");
        textView_title.setTypeface(typeface);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button_goal_a:
                increment_goal(textView_goalA);
                break;
            case R.id.button_offside_a:
                increment_offside(textView_offsideA);
                break;
            case R.id.button_foul_a:
                increment_foul(textView_foulA);
                break;

            case R.id.button_goal_b:
                increment_goal(textView_goalB);
                break;
            case R.id.button_offside_b:
                increment_offside(textView_offsideB);
                break;
            case R.id.button_foul_b:
                increment_foul(textView_foulB);
                break;
            case R.id.button_reset:
                reset_values();
                break;
        }
    }


     void increment_goal(TextView textView)
    {

        String value;
        int goal;

        value=textView.getText().toString();
        goal=Integer.parseInt(value);
        goal=goal+1;

        value=Integer.toString(goal);
        textView.setText(value);
    }

    void increment_offside(TextView textView)
    {

        String value;
        int offside;

        value=textView.getText().toString();
        offside=Integer.parseInt(value);
        offside=offside+1;

        value=Integer.toString(offside);
        textView.setText(value);
    }


    void increment_foul(TextView textView)
    {

        String value;
        int foul;

        value=textView.getText().toString();
        foul=Integer.parseInt(value);
        foul=foul+1;

        value=Integer.toString(foul);
        textView.setText(value);
    }

    void reset_values()
    {
        textView_goalA.setText(R.string.default_value);
        textView_offsideA.setText(R.string.default_value);
        textView_foulA.setText(R.string.default_value);

        textView_goalB.setText(R.string.default_value);
        textView_offsideB.setText(R.string.default_value);
        textView_foulB.setText(R.string.default_value);
    }
}
