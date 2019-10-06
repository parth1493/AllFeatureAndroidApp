package com.parth.allfeatureandroidapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<Integer> mutableLiveDataCount;
    private int counter ;

    public MutableLiveData<Integer> intiCouter() {
        if(mutableLiveDataCount == null){
            mutableLiveDataCount = new MutableLiveData<>();
        }
        mutableLiveDataCount.setValue(counter);
        return mutableLiveDataCount;
    }

    public void couterAdd() {
        counter++;
        mutableLiveDataCount.setValue(counter);
    }
}
