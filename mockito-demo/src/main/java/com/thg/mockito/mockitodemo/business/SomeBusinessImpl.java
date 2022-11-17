package com.thg.mockito.mockitodemo.business;

import javax.xml.crypto.Data;

public class SomeBusinessImpl {

    private final DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData(){
        int[] data = dataService.retriveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for (int value: data){
            if (value > greatestValue) greatestValue = value;
        }
        return greatestValue;
    }
}

