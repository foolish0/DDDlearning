package com.gebriel.adapter.demo.converter;

import com.gebriel.adapter.demo.request.HelloRequestVO;
import com.gebriel.application.demo.dto.HelloDTO;

/**
 * @author lizhenjiang
 */
public class DemoConverter {
    HelloDTO toHelloDTO(HelloRequestVO requestVO) {
        return new HelloDTO();
    }
}
