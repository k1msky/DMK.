package com.dmk.dmk;

import android.app.Activity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class playActivity extends Activity {

    RadioButton Duck1, Duck2;
    Button NextButton;
    TextView SampleTextView;

    protected void onCreate(Bundle playAct) {
        super.onCreate(playAct);
        setContentView(R.layout.play);

        final int[] DuckCount = {0};
        int MarryCount = 0;
        int KillCount = 0;

        Duck1 = (RadioButton) findViewById(R.id.Duck1);
        Duck2 = (RadioButton) findViewById(R.id.Duck2);
        NextButton = (Button) findViewById(R.id.NextButton);
        SampleTextView = (TextView) findViewById(R.id.SampleTextView);

        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Duck1.isSelected()){
                   // int Ducks = DuckCount[1]++;
                    SampleTextView.setVisibility(View.INVISIBLE);
                    //System.out.println("The number of Ducks is:"+ DuckCount);

                }

            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
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
}
