package edu.cnm.deepdive.homesteadapplication.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import edu.cnm.deepdive.homesteadapplication.R;

public class WeatherFragment extends Fragment {

  private WeatherViewModel weatherViewModel;

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    weatherViewModel =
        ViewModelProviders.of(this).get(WeatherViewModel.class);
    View root = inflater.inflate(R.layout.fragment_share, container, false);
    final TextView textView = root.findViewById(R.id.text_share);
    weatherViewModel.getText().observe(this, new Observer<String>() {
      @Override
      public void onChanged(@Nullable String s) {
        textView.setText(s);
      }
    });
    return root;
  }
}