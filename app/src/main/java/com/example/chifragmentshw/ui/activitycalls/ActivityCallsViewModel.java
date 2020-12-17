package com.example.chifragmentshw.ui.activitycalls;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ActivityCallsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ActivityCallsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ActivityCalls fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}