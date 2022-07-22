/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Application;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.Metadata.MachineData;
import rmi.communication.EventData;

/**
 *
 * @author m.faisal1521
 */
public class Client {
     public static void main(String args[]) { 
         try {
            // Getting the registry 
            Registry registry = LocateRegistry.getRegistry(5000);

            // Looking up the registry for the remote object 
            EventData machine = (EventData) registry.lookup("MachineData");

            while (true) 
            {
            /// Get Data From Aggregator after 0.5 second 
                Thread.sleep(500);
                System.out.println(machine.GetAggregatorData());
            }
            
        } catch (Exception ex) {
            System.out.println("Exception :" + ex.getMessage());
        } 
    }
    
}
