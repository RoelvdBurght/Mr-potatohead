package rgburght.gmail.com.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(android.view.View w) {
        android.util.Log.d(tag:"potato", msg:"checkClicked: ");
    }

}
