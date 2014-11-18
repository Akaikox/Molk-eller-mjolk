package se.molk.molkmjolk;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.LinkedList;
import java.util.List;


public class Play extends Activity {




    //private MediaPlayer music;

    //public void playMedia(int resourceId) {
        //music = MediaPlayer.create(this, resourceId);
        //music.start();
    //}



    public void openMenuActivity(View view) {
        Intent menuintent = new Intent(this, MenuActivity.class);
        startActivity(menuintent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getActionBar().hide();
        //playMedia(R.raw.bennyhill);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNewCard();
            }
        });


    }

    private List<Integer> myCards = new LinkedList<Integer>();

    public void showNewCard() {
        ImageView iv = (ImageView) findViewById(R.id.myImage);
        iv.setImageResource(R.drawable.molklogga2);
    }


    //@Override
    //protected void onPause() {
        //super.onPause();
        //music.stop();
    //}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
