/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adap;

import com.krishna.PilotPen;

/**
 *
 * @author localadmin
 */
public class PenAdapter implements Pen {
    PilotPen pp = new PilotPen();
    
    @Override
    public void write(String str) {
        pp.mark(str);
        
    }
    
}
