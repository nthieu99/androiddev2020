package vn.edu.usth.weather;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("log", "This is onCreate()");
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
