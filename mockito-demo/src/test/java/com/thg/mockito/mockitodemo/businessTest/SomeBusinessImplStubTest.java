package com.thg.mockito.mockitodemo.businessTest;

import com.thg.mockito.mockitodemo.business.DataService;
import com.thg.mockito.mockitodemo.business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basic(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceStub);
        var result = someBusiness.findTheGreatestFromAllData();
        assertEquals(25, result);
    }


}

class DataServiceStub implements DataService {

    @Override
    public int[] retriveAllData() {
        // retornar dados ficticios
        return new int[] {25,15,5};
        }
    }
