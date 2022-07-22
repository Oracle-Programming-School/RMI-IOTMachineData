package rmi.communication;

// Implementing the remote interface 

import java.rmi.RemoteException;
import rmi.Metadata.Data;
import static rmi.Metadata.SensorProcessed.AirPressureList;
import static rmi.Metadata.SensorProcessed.AverageAirPressure;
import static rmi.Metadata.SensorProcessed.AverageTemprature;
import static rmi.Metadata.SensorProcessed.tempratureList;

public class EventDataImpl implements EventData {  
   
    @Override
    public void postTemprature(String MachineName, int Value) throws RemoteException {
       // System.out.println( MachineName + " Temprature : "+Value);
        //Store data temprature into array for aggregator processing
        Data d = new Data(MachineName,Value);
        tempratureList.add(d);
    }

    @Override
    public void postAirPressure(String MachineName, int Value) throws RemoteException {
      //  System.out.println( MachineName + " AirPressure : "+Value);
        //Store data temprature into array for aggregator processing
        Data d = new Data(MachineName,Value);
        AirPressureList.add(d);
    }

    @Override
    public String GetAggregatorData() throws RemoteException {
        return AverageTemprature + " and  " + AverageAirPressure;
    }
} 