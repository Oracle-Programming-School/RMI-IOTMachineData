/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.communication;
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 
import rmi.Metadata.Aggregator;

public class Server extends EventDataImpl { 
   public Server() {} 
   public static void main(String args[]) { 
      try { 
         // Instantiating the implementation class 
         EventDataImpl obj = new EventDataImpl(); 
         EventData stub = (EventData) UnicastRemoteObject.exportObject(obj, 0);  
         
         // Binding the remote object (stub) in the registry , Machine will post data on this class
         Registry registry = LocateRegistry.createRegistry(5000);
         registry.bind("MachineData", stub);  
         
                // Start Aggregator to process data -- Temprature 
                Aggregator AggregateTemprature = new Aggregator("AggregateTemprature");
                AggregateTemprature.start();
                
                //Start Aggregator to process data -- Air Pressure
                Aggregator AggregateAirPressure = new Aggregator("AggregateAirPressure");
                AggregateAirPressure.start();
                
         
         System.err.println("Server is running .."); 
         
      } catch (Exception e) { 
         System.err.println("Server exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
} 