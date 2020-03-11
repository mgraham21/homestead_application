package edu.cnm.deepdive.homesteadapplication.controller;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EventsViewModel extends ViewModel {

  private MutableLiveData<String> mText;

  public EventsViewModel() {
    mText = new MutableLiveData<>();
    mText.setValue("This is slideshow fragment");
  }

  public LiveData<String> getText() {
    return mText;
  }
}