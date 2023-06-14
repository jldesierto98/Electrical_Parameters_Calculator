package com.radiant.radiant.service;

import com.radiant.radiant.request.VoltageDropRequest;
import com.radiant.radiant.response.VoltageDropResponse;

public interface VoltageDropService {
    VoltageDropResponse calculateVoltageDrop(VoltageDropRequest request);
}
