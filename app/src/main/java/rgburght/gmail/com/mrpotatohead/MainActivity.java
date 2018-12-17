package rgburght.gmail.com.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView arms;
    private ImageView body;
    private ImageView shoes;
    private ImageView nose;
    private ImageView ears;
    private ImageView eyes;
    private ImageView glasses;
    private ImageView eyebrows;
    private ImageView hat;
    private ImageView mouth;

    boolean armsBool;
    boolean bodyBool;
    boolean shoesBool;
    boolean noseBool;
    boolean earsBool;
    boolean eyesBool;
    boolean glassesBool;
    boolean eyebrowsBool;
    boolean hatBool;
    boolean mouthBool;

    String tag = "Main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = findViewById(R.id.arms);
        body = findViewById(R.id.body);
        shoes = findViewById(R.id.shoes);
        nose = findViewById(R.id.nose);
        ears = findViewById(R.id.ears);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        eyebrows = findViewById(R.id.eyebrows);
        hat = findViewById(R.id.hat);
        mouth = findViewById(R.id.mouth);


        ImageView[] imageViews = {arms, body, shoes, nose, ears, eyes, glasses,
                eyebrows, hat, mouth};


        // if instances where saved, get their boolean value representing the visibility
        if (savedInstanceState != null) {
            armsBool = savedInstanceState.getBoolean("arms");
            bodyBool = savedInstanceState.getBoolean("body");
            shoesBool = savedInstanceState.getBoolean("shoes");
            noseBool = savedInstanceState.getBoolean("nose");
            earsBool = savedInstanceState.getBoolean("ears");
            eyesBool = savedInstanceState.getBoolean("eyes");
            eyebrowsBool = savedInstanceState.getBoolean("eyebrows");
            hatBool = savedInstanceState.getBoolean("hat");
            glassesBool = savedInstanceState.getBoolean("glasses");
            mouthBool = savedInstanceState.getBoolean("mouth");
        }

        boolean[] checkBools = {armsBool, bodyBool, shoesBool, noseBool, earsBool, glassesBool,
                eyebrowsBool, mouthBool, hatBool, mouthBool};

        // set the visibility according to the boolean values
        int l = checkBools.length;
        for (int i = 0; i < l; i ++) {
            if (checkBools[i]) {
                imageViews[i].setVisibility(View.VISIBLE);
            }
            else {
                imageViews[i].setVisibility(View.INVISIBLE);
            }
        }
    }

    // Save the show/unshown views when exiting app/turning screen
    public void onSaveInstanceState(Bundle outState) {

        arms = findViewById(R.id.arms);
        body = findViewById(R.id.body);
        shoes = findViewById(R.id.shoes);
        nose = findViewById(R.id.nose);
        ears = findViewById(R.id.ears);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        eyebrows = findViewById(R.id.eyebrows);
        hat = findViewById(R.id.hat);
        mouth = findViewById(R.id.mouth);

        // put views in array as to not write millions of lines of code
        ImageView[] imageViews = {arms, body, shoes, nose, ears, eyes, glasses
                , eyebrows, hat, mouth};
        String[] names = {"arms", "body", "shoes", "nose", "ears", "eyes", "glasses",
                "eyebrows", "hat", "mouth"};

        // loop over the array and save the state using booleans
        for (int i = 0; i < imageViews.length; i++) {
            if (imageViews[i].isShown()) {
                outState.putBoolean(names[i], true);
            }
            else {
                outState.putBoolean(names[i], false);
            }
        }
        super.onSaveInstanceState(outState);
    }

    // Gets called when a checkbox is clicked
    // Makes the correct imageview visible/invisible accordingly
    public void checkClicked(View v) {

        CheckBox check = (CheckBox) v;
        int id = v.getId();

        // If the checkbox is checked, make the view visible
        if (check.isChecked()) {
            switch (id) {
                case R.id.ckeckArms:
                    arms.setVisibility(View.VISIBLE);
                    break;
                case R.id.checkBody:
                    body.setVisibility(View.VISIBLE);
                    break;
                case R.id.checkShoes:
                    shoes.setVisibility(View.VISIBLE);
                    break;
                case R.id.checkNose:
                    nose.setVisibility(View.VISIBLE);
                    break;
                case R.id.checkEyes:
                    eyes.setVisibility(View.VISIBLE);
                    break;
                case R.id.checkGlasses:
                    glasses.setVisibility(View.VISIBLE);
                    break;
                case R.id.checkEyebrows:
                    eyebrows.setVisibility(View.VISIBLE);
                    break;
                case R.id.checkHat:
                    hat.setVisibility(View.VISIBLE);
                    break;
                case R.id.checkMouth:
                    mouth.setVisibility(View.VISIBLE);
                    break;
                case R.id.checkEars:
                    ears.setVisibility(View.VISIBLE);
                    break;
            }
        }

        // if the checkbox is unchecked, make the view invisible
        if (!check.isChecked()) {

            switch (id) {
                case R.id.ckeckArms:
                    arms.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkBody:
                    body.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkShoes:
                    shoes.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkNose:
                    nose.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkEyes:
                    eyes.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkGlasses:
                    glasses.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkEyebrows:
                    eyebrows.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkHat:
                    hat.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkMouth:
                    mouth.setVisibility(View.INVISIBLE);
                    break;
                case R.id.checkEars:
                    ears.setVisibility(View.INVISIBLE);
                    break;
            }
        }
    }
}
