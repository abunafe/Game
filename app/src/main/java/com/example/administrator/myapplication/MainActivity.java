package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button [] array;
    boolean state=true;
    boolean  therISwinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        array=new Button[]{b1,b2,b3,b4,b5,b6,b7,b8,b9};
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Button b=(Button)v;
        clickX_O(b);

    }
    public  void clickX_O(Button b){
        if (state){
            b.setText("X");

        }
        else{
            b.setText("O");

        }
        state=!state;
        b.setClickable(false);
        checkwinnwer();

    }
    private  void checkwinnwer(){

        if(b1.getText()==b2.getText()&&b2.getText()==b3.getText()&&!b1.isClickable())
            therISwinner=true;
        else if(b4.getText()==b5.getText()&&b5.getText()==b6.getText()&&!b4.isClickable())
            therISwinner=true;
        else if(b7.getText()==b8.getText()&&b8.getText()==b9.getText()&&!b7.isClickable())
            therISwinner=true;
        else if(b1.getText()==b4.getText()&&b4.getText()==b7.getText()&&!b1.isClickable())
            therISwinner=true;
        else if(b3.getText()==b6.getText()&&b6.getText()==b9.getText()&&!b3.isClickable())
            therISwinner=true;
        else if(b1.getText()==b5.getText()&&b5.getText()==b9.getText()&&!b1.isClickable())
            therISwinner=true;
        else if(b3.getText()==b5.getText()&&b5.getText()==b7.getText()&&!b3.isClickable())
            therISwinner=true;
        else therISwinner=false;
        if(therISwinner){
            if(!state){
                Toast.makeText(this,"X plaer win",Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this,"O plaer win",Toast.LENGTH_SHORT).show();
            }
        }


    }
}




