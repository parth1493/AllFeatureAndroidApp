package com.parth.allfeatureandroidapp;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int counter =0 ;

    public int intiCouter() {
        return counter;
    }

    public int couterAdd() {
        counter++;
        return counter;
    }
}
