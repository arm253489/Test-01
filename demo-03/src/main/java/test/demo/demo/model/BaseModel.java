/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.demo.demo.model;

/**
 *
 * @author Panaporn
 */
public class BaseModel {

    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BaseModel{another=").append(another);
        sb.append('}');
        return sb.toString();
    }

}
