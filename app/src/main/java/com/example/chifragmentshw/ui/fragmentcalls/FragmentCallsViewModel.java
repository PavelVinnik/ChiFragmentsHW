package com.example.chifragmentshw.ui.fragmentcalls;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentCallsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragmentCallsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is FragmentCalls fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}