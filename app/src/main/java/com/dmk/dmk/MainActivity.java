package com.dmk.dmk;

import android.app.Activity;
import android.drm.DrmStore;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends Activity {

    RelativeLayout background;
    Button PlayingButton;
    TextView PlayingText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        PlayingText = (TextView) findViewById(R.id.PlayingText);
        PlayingButton =(Button) findViewById(R.id.PlayingButton);
        background = (RelativeLayout) findViewById(R.id.background);


        PlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //PlayingText.setVisibility(View.VISIBLE);
            //background.setBackgroundColor(Color.parseColor("#006699"));
                setContentView(R.layout.play);
                //MainActivity MActivity = new MainActivity();

            }
            });





        //NextButton.setOnClickListener(new View.OnClickListener() {
            //@Override
           // public void onClick(View v) {

          //  }
       // });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void radio(){


    }
}