package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text_view);
        int text_view2 = (R.id.text_view2);
        textView. setMovementMethod(new ScrollingMovementMethod());

    }
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view) .isChecked();
        switch (view.getId()){
            case R.id.checkbox_safaricom:
                if(checked){
                    //
                }
                    else {

                }
                break;
            case R.id.checkbox_faiba:
                if(checked){
                    //
                }
                    else{}
                break;
            case R.id.checkbox_airtel:
                if(checked){
                    //
                }

                    else {
                    //
                }
                break;
            case R.id.checkbox_telkom:
                if(checked){}
                    else{}
                break;
            case R.id.checkbox_others:
                if(checked){

                }
                    else{

                }
                break;

        }



    }
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view) .isChecked();
        switch (view.getId()){
            case R.id.radio_first:
                if (checked){


                }
                break;
            case R.id.radio_second:
                if (checked){}
                break;
        }

    }
}
