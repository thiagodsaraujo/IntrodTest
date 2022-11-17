package com.thg.mockito.mockitodemo.businessTest;

import com.thg.mockito.mockitodemo.business.DataService;
import com.thg.mockito.mockitodemo.business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl someBusiness;


    @Test
    void findTheGreatestFromAllData_basic(){
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {25,15,5});
        assertEquals(25, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromOneValueTest(){
//        var dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {35});
        assertEquals(35, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromEmptyArray(){
//        var dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, someBusiness.findTheGreatestFromAllData());
    }


}

