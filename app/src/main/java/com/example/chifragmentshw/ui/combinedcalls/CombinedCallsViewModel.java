package com.example.chifragmentshw.ui.combinedcalls;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CombinedCallsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CombinedCallsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is CombinedCalls fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}