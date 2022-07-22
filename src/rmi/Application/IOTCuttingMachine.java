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
public class IOTCuttingMachine {
    
    public static void main(String args[]) { 
        try {
            // This cutting machine IOT decive will generate random data,
            // Temprature will be between 100 to 200 , and airpresssure will be 40 to 50
            MachineData MD = new MachineData("CuttingMachine",100,200,40,50);
            MD.Start();
        } catch (Exception ex) {
            System.out.println("Exception :" + ex.getMessage());
        } 
    }
    
}
