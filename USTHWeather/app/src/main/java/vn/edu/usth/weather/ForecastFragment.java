package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = new View(getContext());
        view.setBackgroundColor(0x6080DF80);
        return inflater.inflate(R.layout.fragment_forecast, container, false);
    }

}