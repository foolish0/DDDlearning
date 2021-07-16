package com.gebriel.adapter.demo.controller;

import com.gebriel.adapter.demo.request.HelloRequestVO;
import com.gebriel.adapter.demo.response.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhenjiang
 */
@RestController
public class DemoController {

    @PostMapping("/helloDDD")
    public Response helloDomainDriveDesign(HelloRequestVO requestVO) {
        Response response = new Response();

        response.setCode("0");
        response.setMessage("success");
        response.setData("Hello DDD!");
        return response;
    }
}
