package com.mutwakilmo.android.topquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private TextView mGreetingText;
   private EditText mNameInput;
   private Button mPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mGreetingText = (TextView) findViewById(R.id.activity_main_greeting_txt);
       mNameInput = (EditText) findViewById(R.id.activity_main_name_input);
       mPlayButton = (Button) findViewById(R.id.activity_main_play_btn);


       // Disable and enable buttons based on user input: setEnabled()
       mPlayButton.setEnabled(false);

       //Manage actions for user input: addTextChangedListener()

       mNameInput.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
               //This where we'll check the user input
               mPlayButton.setEnabled(s.toString().length()!=0);

           }

           @Override
           public void afterTextChanged(Editable s) {

           }
       });


       //Detect clicks:  setOnClickListener()

       mPlayButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               // the user just clicked

           }
       });



    }

    
}
