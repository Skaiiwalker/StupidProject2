package com.example.lbar8299.stupidproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.View;
import android.graphics.Color;
import android.widget.TextView;


public class StupidActivity extends AppCompatActivity
{

    private Button colorChangeButton;
    private Button talkButton;
    private RelativeLayout background;
    private int buttonPushes;
    private TextView basicText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid);

        background = (RelativeLayout) findViewById(R.id.backgroundLayout);
        talkButton = (Button) findViewById(R.id.talkButton);
        colorChangeButton = (Button) findViewById(R.id.sillyButton);
        buttonPushes = (0);
        basicText = (TextView) findViewById(R.id.basicText);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stupid, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void changeBackgroundColor()
    {
        int redColor;
        int greenColor;
        int blueColor;

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        colorChangeButton.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() *256);
        blueColor = (int) (Math.random() * 256);

        talkButton.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));
    }

    private void changeButtonText()
    {
        String [] textOptions = new String[4];

        textOptions [0] = "Whoa now, what are you doing?";
        textOptions [1] = "Hey now, stop that!";
        textOptions [2] = "Seriously, that tickles!";
        textOptions [3] = "*raucous laughter*";

        talkButton.setText(textOptions[buttonPushes]);

    }

    private void changeVisibility()
    {
        if(basicText.getVisibility() == View.VISIBLE)
        {
            basicText.setVisibility(View.GONE);
        }
        else
        {
            basicText.setVisibility(View.VISIBLE);
        }


    }


    private void setupListeners()
    {
        colorChangeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                //This is where the action happens!  (?)
                changeBackgroundColor();
                changeVisibility();

            }
        });

        talkButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeButtonText();
                buttonPushes = (buttonPushes + 1);
            }
        });
    }
}
