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

public class AgenciesFragment extends Fragment {

  private AgenciesViewModel agenciesViewModel;

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    agenciesViewModel =
        ViewModelProviders.of(this).get(AgenciesViewModel.class);
    View root = inflater.inflate(R.layout.fragment_gallery, container, false);
    final TextView textView = root.findViewById(R.id.text_gallery);
    agenciesViewModel.getText().observe(this, new Observer<String>() {
      @Override
      public void onChanged(@Nullable String s) {
        textView.setText(s);
      }
    });
    return root;
  }
}