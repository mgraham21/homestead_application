package edu.cnm.deepdive.homesteadapplication.controller;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WeatherViewModel extends ViewModel {

  private MutableLiveData<String> mText;

  public WeatherViewModel() {
    mText = new MutableLiveData<>();
    mText.setValue("This is share fragment");
  }

  public LiveData<String> getText() {
    return mText;
  }
}