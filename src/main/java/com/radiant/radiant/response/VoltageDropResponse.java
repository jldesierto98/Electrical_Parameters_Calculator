package com.radiant.radiant.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class VoltageDropResponse {

    @ApiModelProperty("Voltage Drop in Volts")
    private Double voltageDrop;

    @ApiModelProperty("Voltage Drop in %")
    private Double voltageDropPercent;

    @ApiModelProperty("1-Copper , 2-Aluminum , 3-Aloy")
    private String materialType;

    @ApiModelProperty("Resistivity in ohms")
    private Double resistivity;

    @ApiModelProperty("Conductor Cross Sectional Area in MM")
    private Double conductorArea;
}
