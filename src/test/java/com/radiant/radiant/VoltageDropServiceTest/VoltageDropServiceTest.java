package com.radiant.radiant.VoltageDropServiceTest;


import com.radiant.radiant.request.VoltageDropRequest;
import com.radiant.radiant.response.VoltageDropResponse;
import com.radiant.radiant.service.VoltageDropServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VoltageDropServiceTest {





        @Test
        public void voltageDropCalculationTest(){
            VoltageDropRequest mockRequest = Mockito.mock(VoltageDropRequest.class);

            // Set up the behavior of the mock request
            when(mockRequest.getVoltage()).thenReturn(10.0);
            when(mockRequest.getLength()).thenReturn(5.0);
            when(mockRequest.getMaterial()).thenReturn(1);
            when(mockRequest.getWireSize()).thenReturn(2);

            // Create an instance of the service class
            VoltageDropServiceImpl voltageDropService = new VoltageDropServiceImpl();

            // Call the method under test
            VoltageDropResponse response = voltageDropService.calculateVoltageDrop(mockRequest);
            double respDrop = response.getVoltageDrop();
            double testDrop = 50.0;

            // Verify the expected values in the response
            assertEquals(testDrop, respDrop, 0.01);

        }

}
