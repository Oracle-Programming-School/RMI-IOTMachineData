/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.communication;
import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application , This interface with communicate with Server 
// and other source like machines and aggregator for data communication. 

public interface EventData extends Remote {  
   //Post Data from IOT Machines To Server
   void postTemprature  (String MachineName,int Value) throws RemoteException;
   void postAirPressure   (String MachineName,int Value) throws RemoteException;
   String GetAggregatorData () throws RemoteException;
} 