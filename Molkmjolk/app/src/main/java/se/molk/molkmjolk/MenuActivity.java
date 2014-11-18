package se.molk.molkmjolk;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends Activity {

//TA BORT FINISH OCH FIXA ALTERNATIV TILL "startActivity"

    public void openSetActivity(View view) {
        Intent setintent = new Intent(this, Settings.class);
        startActivity(setintent);
        this.finish();
    }

    public void openHighActivity(View view) {
        Intent highintent = new Intent(this, Highscore.class);
        startActivity(highintent);
        this.finish();
    }

    public void openPlayActivity(View view) {
        Intent playintent = new Intent(this, Play.class);
        startActivity(playintent);
        this.finish();
    }

    public void openAboutActivity(View view) {
        Intent aboutintent = new Intent(this, About.class);
        startActivity(aboutintent);
        finish();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getActionBar().hide();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
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
