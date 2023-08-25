package com.example.frenchteacherapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bluebtn , yellowbtn , pinkbtn , purplebtn , greenbtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bluebtn = findViewById(R.id.bluebtn);
        yellowbtn = findViewById(R.id.yellowbtn);
        pinkbtn = findViewById(R.id.pinkbtn);
        purplebtn = findViewById(R.id.purplebtn);
        greenbtn = findViewById(R.id.greenbtn);


        bluebtn.setOnClickListener(this);
        pinkbtn.setOnClickListener(this);
        purplebtn.setOnClickListener(this);
        yellowbtn.setOnClickListener(this);
        greenbtn.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if(id==R.id.yellowbtn){
            play(R.raw.yellow);

        }

        else if (id==R.id.pinkbtn){
            play(R.raw.pink);

        }
        else if (id==R.id.bluebtn){
            play(R.raw.bule);

        }

        else if (id==R.id.purplebtn){
            play(R.raw.purple);

        }
        else if (id==R.id.greenbtn){
            play(R.raw.green);

        }


    }

    public void play(int id){
        MediaPlayer mp = MediaPlayer.create(
                getApplicationContext(),
                id);

        mp.start();
    }
}