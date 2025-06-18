package com.example.myapp.service;

import org.springframework.stereotype.Service;
import com.example.common.endpoints.CustomizableEndpointService;

@Service
public class AppEndpointServiceImpl implements CustomizableEndpointService {

  @Override
  public String getCustomStatus() {
    return "{\"status\":\"CUSTOM\",\"message\":\"This is from the consumer application\"}";
  }



}
