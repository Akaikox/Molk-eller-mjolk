package se.molk.molkmjolk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

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

    // Define a list of possible cards to show
    private List<Integer> myCardDeck = Arrays.asList(
            R.drawable.molklogga2,
            R.drawable.molklogga3,
            R.drawable.molklogga4);

    // Initiate a random number generator
    private Random randomNumberGenerator = new Random();

    // Call this method to show a random new card in the ImageView
    public void showNewCard() {
        ImageView iv = (ImageView) findViewById(R.id.myImage);
        iv.setImageResource(getRandomCard());
    }

    // This function takes a random card from myCardDeck
    public int getRandomCard() {
        // Call the random number generator to get a random number between 0 and myCardDeck.size()
        int randomCardNumber = randomNumberGenerator.nextInt(myCardDeck.size());

        // return the card
        return myCardDeck.get(randomCardNumber);
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
