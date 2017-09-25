package com.example.win7.nis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int counterA, counterB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        //System.out.println("wow");

        Button btn = (Button) view;

        //System.out.println(btn.getText());
        //btn.setText(btn.getText().toString().split(" ")[0] + btn.getText().toString().split(" ")[1] + " " + ++counter);
        //btn.setText("Click me " + ++counter);

        int id = view.getId();
        if(id == R.id.first_btn){
            btn.setText("Click me " + ++counterA);
        }else{
            btn.setText("Click me " + ++counterB);
        }
    }

}
