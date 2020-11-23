/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.demo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.demo.demo.response.TestResponse;
import test.demo.demo.service.TestService;

/**
 *
 * @author Panaporn
 */
@RestController
public class AppController {

    @Autowired
    private TestService testService;

    @GetMapping("/get")
    TestResponse customHeader() throws Exception {
        TestResponse responses = testService.get();
        return responses;
    }

}
