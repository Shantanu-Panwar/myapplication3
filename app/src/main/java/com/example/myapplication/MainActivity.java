package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView out;
   EditText x,y;
   Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x=findViewById(R.id.shantanu);
        y=findViewById(R.id.shantanu);
        out=findViewById(R.id.ouput);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(v-> {
            int xx=Integer.parseInt(x.getText().toString());
            int yy=Integer.parseInt(y.getText().toString());
            Log.d("msg",xx+yy+"");
            out.setText(xx+yy+"");
        }
        );
}

}