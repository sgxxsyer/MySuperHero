package com.example.it2107.dit.nyp.com.mysuperhero;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Spinner spLocations;
    ArrayAdapter<CharSequence> adapter;
    TextView superHeroTV;
    String[] strArray;
    String[] superHeros = {"1.BatMan\n 2. SpiderMan", "1.Peter Pan \n 2.SuperMan","1. IronMan\n 2.Peter Pan","1. SnowWhite\n 2. Gingerbreadman"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        superHeroTV = (TextView) findViewById(R.id.superHerosTV);
        spLocations =(Spinner) findViewById(R.id.spLocations);

        Resources myRes= this.getResources();
        strArray =myRes.getStringArray(R.array.locationArea);

        adapter = ArrayAdapter.createFromResource(this,R.array.locationArea,android.R.layout.simple_spinner_dropdown_item);
    spLocations.setAdapter(adapter);

        spLocations.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            public void onItemSelected(AdapterView<?> arg0, View agr1,int arg2,long arg3){

                String text=superHeros[arg2];
                superHeroTV.setText(text);
            }
            public void onNothingSelected(AdapterView<?> arg0){
                superHeroTV.setText("There is no super Heroes for this area");

            }




        });

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
}
