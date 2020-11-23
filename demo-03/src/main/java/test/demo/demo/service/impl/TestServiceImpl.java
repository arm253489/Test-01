/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.demo.demo.service.impl;

import org.springframework.stereotype.Service;
import test.demo.demo.response.TestResponse;
import test.demo.demo.service.TestService;

/**
 *
 * @author Panaporn
 */
@Service
public class TestServiceImpl implements TestService {
    
    @Override
    public TestResponse get() throws Exception {
        TestResponse response = new TestResponse();
        response.setTest("rest");
        return response;
    }
    
}
