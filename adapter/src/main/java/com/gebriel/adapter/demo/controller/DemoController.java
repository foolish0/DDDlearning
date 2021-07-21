package com.gebriel.adapter.demo.controller;

import com.gebriel.adapter.demo.converter.DemoConverter;
import com.gebriel.adapter.demo.request.HelloRequestVO;
import com.gebriel.adapter.demo.response.Response;
import com.gebriel.application.demo.app.DemoApplicationService;
import com.gebriel.application.demo.dto.HelloDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhenjiang
 */
@RestController
@RequestMapping("/v1")
public class DemoController {

    @Autowired
    private DemoApplicationService demoApplicationService;

    @PostMapping("/helloDDD")
    public Response helloDomainDriveDesign(HelloRequestVO requestVO) {
        Response response = new Response();
        HelloDTO helloDTO = DemoConverter.toHelloDTO(requestVO);
        Integer result = demoApplicationService.saveHelloRecord(helloDTO);
        response.setCode("200");
        response.setMessage("success");
        response.setData(result);
        return response;
    }
}
