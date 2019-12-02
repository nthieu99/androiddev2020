package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(0xFF7b68ee);


        LinearLayout fragment_container = view.findViewById(R.id.fragment_forecast);
        fragment_container.setOrientation(LinearLayout.VERTICAL);

        ImageView weather = new ImageView(getContext());
        weather.setImageResource(R.drawable.sunny);

        TextView day = new TextView(getContext());
        day.setText("Thursday");
        day.setTextSize(36);
        day.setBackgroundColor(0xFF7b68ee);
        day.setPadding(0, 10, 0, 10);

        fragment_container.addView(weather);
        fragment_container.addView(day);

        return view;
    }
}