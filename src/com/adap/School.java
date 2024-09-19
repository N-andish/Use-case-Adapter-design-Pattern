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
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PilotPen pp = new PilotPen();
        Pen p =new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("Im bit tired to write an Assignment");
        // TODO code application logic here
    }
    
}
