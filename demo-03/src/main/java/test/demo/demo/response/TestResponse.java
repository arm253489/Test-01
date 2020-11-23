/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.demo.demo.response;

/**
 *
 * @author Panaporn
 */
public class TestResponse {

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TestResponse{test=").append(test);
        sb.append('}');
        return sb.toString();
    }

}
