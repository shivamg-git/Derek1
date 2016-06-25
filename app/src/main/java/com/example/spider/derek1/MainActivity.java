package com.example.spider.derek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText personName;

    public void getReferences() {
        personName = (EditText) findViewById(R.id.personName);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getReferences();
    }

    public void yesCommand(View view) {
        String name = String.valueOf(personName.getText());
        String message = name + " you choose Yes!";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);

//      Set a custom Toast.
//      View v = getLayoutInflater().inflate(R.layout.toast,null,false);
//      toast.setView(v);
        toast.show();
    }

    public void noCommand(View view) {
        String name = String.valueOf(personName.getText());
        String message = name + " you choose No!";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

}
