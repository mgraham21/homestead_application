package edu.cnm.deepdive.homesteadapplication.controller;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AgenciesViewModel extends ViewModel {

  private MutableLiveData<String> mText;

  public AgenciesViewModel() {
    mText = new MutableLiveData<>();
    mText.setValue("This is gallery fragment");
  }

  public LiveData<String> getText() {
    return mText;
  }
}