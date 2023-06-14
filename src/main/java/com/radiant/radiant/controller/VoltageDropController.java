package com.radiant.radiant.controller;

import com.radiant.radiant.request.VoltageDropRequest;
import com.radiant.radiant.response.VoltageDropResponse;
import com.radiant.radiant.service.VoltageDropService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/voltageDrop")
public class VoltageDropController {
    private final VoltageDropService voltageDropService;

    @PostMapping("/voltage-drop")
    @ApiOperation(value = "getVoltageDrop", response = VoltageDropResponse.class, produces = "application/json")
    public ResponseEntity<VoltageDropResponse> getVoltageDrop(@RequestBody @Validated VoltageDropRequest request){
        return new ResponseEntity<>(voltageDropService.calculateVoltageDrop(request), HttpStatus.OK);
    }


}
