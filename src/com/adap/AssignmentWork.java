/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adap;

/**
 *
 * @author localadmin
 */
public class AssignmentWork {
    
    private Pen p;
    public Pen getP(){
        return p;
    }
    public void setP(Pen p){
        this.p = p;
    }
    
    public void writeAssignment(String str){
        p.write(str);
        
    }
    
    
}
