/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Application;

import rmi.Metadata.MachineData;

/**
 *
 * @author m.faisal1521
 */
public class IOTPrintingMachine {
    
     public static void main(String args[]) { 
        try {
            // This Printing machine IOT decive will generate random data,
            // Temprature will be between 30 to 40 , and airpresssure will be 60 to 70
            MachineData MD = new MachineData("PrintingMachine",30,40,60,70);
            MD.Start();
        } catch (Exception ex) {
            System.out.println("Exception :" + ex.getMessage());
        } 
    }
}
