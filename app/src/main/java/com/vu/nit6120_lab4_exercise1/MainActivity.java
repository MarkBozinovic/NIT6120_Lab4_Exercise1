package com.vu.nit6120_lab4_exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity //implements View.OnClickListener
{
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        //btn.setOnClickListener(this);

        btn.setOnClickListener
                (
                        new Button.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                TextView myTextView = (TextView)findViewById(R.id.myTextView);
                                myTextView.setText("Button Clicked");
                            }
                        }
                );

        btn.setOnLongClickListener
                (
                        new Button.OnLongClickListener()
                        {
                            public boolean onLongClick(View v)
                            {
                                TextView myTextView = (TextView)findViewById(R.id.myTextView);
                                myTextView.setText("Long button click");
                                return true;
                            }
                        }
                );
    }


}
