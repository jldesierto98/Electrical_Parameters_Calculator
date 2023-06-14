package com.radiant.radiant.request;


import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;


@Data
public class VoltageDropRequest {

    @NotNull(message = "Voltage cannot be left null")
    private Double voltage;

    @NonNull
    private Double load;

    @NonNull
    private Double length;

    @NonNull
    private Integer material;

    @NotNull(message = "Wire size should not be left blank or null.")
    private Integer wireSize;

    @NotNull(message = "Phase is required.")
    private Integer phase;


}
