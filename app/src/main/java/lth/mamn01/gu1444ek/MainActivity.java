package lth.mamn01.gu1444ek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Kallas när kompassknappen klickas på*/
    public void showCompass(View view){
        Intent intent = new Intent(this, CompassActivity.class);
        startActivity(intent);

    }

    /**Kallas när accelerometerknappen klickas på*/
    public void showAcc(View view){
        Intent intent = new Intent(this, AccelerometerActivity.class);
        startActivity(intent);
    }
}