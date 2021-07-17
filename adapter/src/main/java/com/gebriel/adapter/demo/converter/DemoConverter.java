package com.gebriel.adapter.demo.converter;

import com.gebriel.adapter.demo.request.HelloRequestVO;
import com.gebriel.application.demo.dto.HelloDTO;
import org.springframework.beans.BeanUtils;

/**
 * @author lizhenjiang
 */
public class DemoConverter {
    public static HelloDTO toHelloDTO(HelloRequestVO requestVO) {
        HelloDTO helloDTO = new HelloDTO();
        BeanUtils.copyProperties(requestVO, helloDTO);
        return helloDTO;
    }
}
