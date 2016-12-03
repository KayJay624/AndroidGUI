package com.example.mobilne.simpletoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuOption1:
                Toast toast_settings1 = Toast.makeText(getApplicationContext(), "Option One selected", Toast.LENGTH_SHORT);
                toast_settings1.show();
                return true;
            case R.id.menuOption2:
                Toast toast_settings2 = Toast.makeText(getApplicationContext(), "Option Two selected", Toast.LENGTH_SHORT);
                toast_settings2.show();
                return true;

            case R.id.menuOption3:
                Toast toast_settings3 = Toast.makeText(getApplicationContext(), "Option Three selected", Toast.LENGTH_SHORT);
                toast_settings3.show();
                return true;

            case R.id.action_edit:
                Toast toast_edit = Toast.makeText(getApplicationContext(), "Edit selected", Toast.LENGTH_SHORT);
                toast_edit.show();
                return true;

            case R.id.action_search:
                Toast toast_search = Toast.makeText(getApplicationContext(), "Search selected", Toast.LENGTH_SHORT);
                toast_search.show();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
