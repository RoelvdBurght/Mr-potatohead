package rgburght.gmail.com.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView arms = (ImageView) findViewById(R.id.arms);
        ImageView body = (ImageView) findViewById(R.id.body);
        ImageView shoes = (ImageView) findViewById(R.id.shoes);
        ImageView nose = (ImageView) findViewById(R.id.nose);
        ImageView ears = (ImageView) findViewById(R.id.ears);
        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        ImageView hat = (ImageView) findViewById(R.id.hat);
        ImageView mouth = (ImageView) findViewById(R.id.mouth);

        boolean armsBool = false;
        boolean bodyBool = false;
        boolean shoesBool = false;
        boolean noseBool = false;
        boolean earsBool = false;
        boolean eyesBool = false;
        boolean glassesBool = false;
        boolean eyebrowsBool = false;
        boolean hatBool = false;
        boolean mouthBool = false;

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

        if (armsBool) {
            arms.setVisibility(View.VISIBLE);
        }
        else {
            arms.setVisibility(View.INVISIBLE);
        }

        if (bodyBool) {
            body.setVisibility(View.VISIBLE);
        }
        else {
            body.setVisibility(View.INVISIBLE);
        }
        if (shoesBool) {
            shoes.setVisibility(View.VISIBLE);
        }
        else {
            shoes.setVisibility(View.INVISIBLE);
        }

        if (noseBool) {
            nose.setVisibility(View.VISIBLE);
        }
        else {
            nose.setVisibility(View.INVISIBLE);
        }

        if (mouthBool) {
            mouth.setVisibility(View.VISIBLE);
        }
        else {
            mouth.setVisibility(View.INVISIBLE);
        }

        if (eyesBool) {
            eyes.setVisibility(View.VISIBLE);
        }
        else {
            eyes.setVisibility(View.INVISIBLE);
        }

        if (eyebrowsBool) {
            eyebrows.setVisibility(View.VISIBLE);
        }
        else {
            eyebrows.setVisibility(View.INVISIBLE);
        }

        if (earsBool) {
            ears.setVisibility(View.VISIBLE);
        }
        else {
            ears.setVisibility(View.INVISIBLE);
        }

        if (hatBool) {
            hat.setVisibility(View.VISIBLE);
        }
        else {
            hat.setVisibility(View.INVISIBLE);
        }
        if (glassesBool) {
            glasses.setVisibility(View.VISIBLE);
        }
        else {
            glasses.setVisibility(View.INVISIBLE);
        }
    }

    public void onSaveInstanceState(Bundle outState) {

        ImageView arms = (ImageView) findViewById(R.id.arms);
        ImageView body = (ImageView) findViewById(R.id.body);
        ImageView shoes = (ImageView) findViewById(R.id.shoes);
        ImageView nose = (ImageView) findViewById(R.id.nose);
        ImageView ears = (ImageView) findViewById(R.id.ears);
        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        ImageView hat = (ImageView) findViewById(R.id.hat);
        ImageView mouth = (ImageView) findViewById(R.id.mouth);

        if (arms.isShown()) {
            outState.putBoolean("arms", true);
        }
        else {
            outState.putBoolean("arms", false);
        }

        if (shoes.isShown()) {
            outState.putBoolean("shoes", true);
        }
        else {
            outState.putBoolean("shoes", false);
        }

        if (nose.isShown()) {
            outState.putBoolean("nose", true);
        }
        else {
            outState.putBoolean("nose", false);
        }

        if (mouth.isShown()) {
            outState.putBoolean("mouth", true);
        }
        else {
            outState.putBoolean("mouth", false);
        }

        if (eyes.isShown()) {
            outState.putBoolean("eyes", true);
        }
        else {
            outState.putBoolean("eyes", false);
        }

        if (eyebrows.isShown()) {
            outState.putBoolean("eyebrows", true);
        }
        else {
            outState.putBoolean("eyebrows", false);
        }

        if (ears.isShown()) {
            outState.putBoolean("ears", true);
        }
        else {
            outState.putBoolean("ears", false);
        }

        if (glasses.isShown()) {
            outState.putBoolean("glasses", true);
        }
        else {
            outState.putBoolean("glasses", false);
        }

        if (hat.isShown()) {
            outState.putBoolean("hat", true);
        }
        else {
            outState.putBoolean("hat", false);
        }

        if (body.isShown()) {
            outState.putBoolean("body", true);
        }
        else {
            outState.putBoolean("body", false);
        }
        super.onSaveInstanceState(outState); // always call super
    }

    public void checkClicked(View v) {
        CheckBox check = (CheckBox) v;
        String text = check.getText().toString();

        ImageView arms = (ImageView) findViewById(R.id.arms);
        ImageView body = (ImageView) findViewById(R.id.body);
        ImageView shoes = (ImageView) findViewById(R.id.shoes);
        ImageView nose = (ImageView) findViewById(R.id.nose);
        ImageView ears = (ImageView) findViewById(R.id.ears);
        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        ImageView hat = (ImageView) findViewById(R.id.hat);
        ImageView mouth = (ImageView) findViewById(R.id.mouth);

        // Als de gebruikte box aangevinkt is, zet bijbehorende view op zichtbaar
        if (check.isChecked()) {
            if (text.equals("Arms")) {
                arms.setVisibility(View.VISIBLE);
            }
            if (text.equals("Body")) {
                body.setVisibility(View.VISIBLE);
            }
            if (text.equals("Shoes")) {
                shoes.setVisibility(View.VISIBLE);
            }
            if (text.equals("Nose")) {
                nose.setVisibility(View.VISIBLE);
            }
            if (text.equals("Eyes")) {
                eyes.setVisibility(View.VISIBLE);
            }
            if (text.equals("Glasses")) {
                glasses.setVisibility(View.VISIBLE);
            }
            if (text.equals("Eyebrows")) {
                eyebrows.setVisibility(View.VISIBLE);
            }
            if (text.equals("Hat")) {
                hat.setVisibility(View.VISIBLE);
            }
            if (text.equals("Mouth")) {
                mouth.setVisibility(View.VISIBLE);
            }
            if (text.equals("Ears")) {
                ears.setVisibility(View.VISIBLE);
            }
        }

        // Als de gebruikte box aangevinkt is, zet bijbehorende view op ontzichtbaar
        if (!check.isChecked()) {
            if (text.equals("Arms")) {
                arms.setVisibility(View.INVISIBLE);
            }
            if (text.equals("Body")) {
                body.setVisibility(View.INVISIBLE);
            }
            if (text.equals("Shoes")) {
                shoes.setVisibility(View.INVISIBLE);
            }
            if (text.equals("Nose")) {
                nose.setVisibility(View.INVISIBLE);
            }
            if (text.equals("Eyes")) {
                eyes.setVisibility(View.INVISIBLE);
            }
            if (text.equals("Glasses")) {
                glasses.setVisibility(View.INVISIBLE);
            }
            if (text.equals("Eyebrows")) {
                eyebrows.setVisibility(View.INVISIBLE);
            }
            if (text.equals("Hat")) {
                hat.setVisibility(View.INVISIBLE);
            }
            if (text.equals("Mouth")) {
                mouth.setVisibility(View.INVISIBLE);
            }
            if (text.equals("Ears")) {
                ears.setVisibility(View.INVISIBLE);
            }
        }
    }
}
