package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import android.media.MediaPlayer;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("log", "This is onCreate()");

        PagerAdapter adapter = new WeatherAndForecastFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.weather_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, R.string.refresh_message, Toast.LENGTH_SHORT).show();
        return true;
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
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song);
        mediaPlayer.start();
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
