package edu.cnm.deepdive.homesteadapplication.controller;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResourcesViewModel extends ViewModel {

  private MutableLiveData<String> mText;

  public ResourcesViewModel() {
    mText = new MutableLiveData<>();
    mText.setValue("This is send fragment");
  }

  public LiveData<String> getText() {
    return mText;
  }
}