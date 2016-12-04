package com.example.mobilne.simpletoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        //--- text view ---
        final TextView textView = (TextView) findViewById(R.id.text_view);

        //--- edit text ---
        final EditText editText = (EditText) findViewById(R.id.edit_text);

        //--- checkboxes ---
        final CheckBox ch1=(CheckBox)findViewById(R.id.checkBox1);
        final CheckBox ch2=(CheckBox)findViewById(R.id.checkBox2);
        final CheckBox ch3=(CheckBox)findViewById(R.id.checkBox3);

        //--- image button ---
        ImageButton btn = (ImageButton) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = editText.getText().toString();
                textView.setText(str);

                StringBuffer result = new StringBuffer();
                result.append("checkbox 1 is checked : ").append(ch1.isChecked());
                result.append("\ncheckbox 2 is checked: ").append(ch2.isChecked());
                result.append("\ncheckbox 3 is checked: ").append(ch3.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();

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
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast toast = Toast.makeText(getApplicationContext(), "Settings selected", Toast.LENGTH_SHORT);
                toast.show();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
