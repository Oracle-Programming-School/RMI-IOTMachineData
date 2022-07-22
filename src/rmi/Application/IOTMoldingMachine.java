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
public class IOTMoldingMachine {
       public static void main(String args[]) { 
        try {
            // This Molding machine IOT decive will generate random data,
            // Temprature will be between 500 to 600 , and airpresssure will be 30 to 45
            MachineData MD = new MachineData("MoldingMachine",500,600,30,45);
            MD.Start();
        } catch (Exception ex) {
            System.out.println("Exception :" + ex.getMessage());
        } 
    }
}
