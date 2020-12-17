package com.example.chifragmentshw;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<String> text = new MutableLiveData<>();

    public void addCall(String s) {
        text.setValue(text.getValue() + s + "\n");
    }

    public LiveData<String> getText() {
        return text;
    }
}
