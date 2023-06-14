package com.radiant.radiant.service;

import com.radiant.radiant.enums.ConductorSizeEnum;
import com.radiant.radiant.request.VoltageDropRequest;
import com.radiant.radiant.enums.ConductorTypeEnum;
import com.radiant.radiant.response.VoltageDropResponse;
import org.springframework.stereotype.Service;

@Service
public class VoltageDropServiceImpl implements VoltageDropService{

    @Override
    public VoltageDropResponse calculateVoltageDrop(VoltageDropRequest request) {



        //build the response.
        return VoltageDropResponse.builder()
                .voltageDrop(request.getVoltage() * request.getLength())
                .materialType(ConductorTypeEnum.getNameByIndex(request.getMaterial()))
                .resistivity(ConductorTypeEnum.getResistivityByIndex(request.getMaterial()))
                .conductorArea(ConductorSizeEnum.getCrossSectionalAreaByIndex(request.getWireSize()))
                .build();
    }

}
