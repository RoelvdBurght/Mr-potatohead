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
    }

    public void checkClicked(View v) {
        Log.d("tag", "hoi");
        CheckBox check = (CheckBox) v;
        String text = check.getText().toString();
        Log.d("text checkbox", text);

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
