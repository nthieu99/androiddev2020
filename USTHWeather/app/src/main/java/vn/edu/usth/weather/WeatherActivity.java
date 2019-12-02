package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("log", "This is onCreate()");
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("log", "This is onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("log", "This is onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("log", "This is onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("log", "This is onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("log", "This is onDestroy()");
    }

}
