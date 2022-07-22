/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Metadata;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Aggregator extends Thread{
    
    String AggregatorName;

    public Aggregator(String AggregatorName) {
        this.AggregatorName = AggregatorName;
    }
    
    @Override
    public void run() {
        
        while(true)
        {
            // these aggregator will work on temprature realtime data
           if (AggregatorName.equals("AggregateTemprature"))
           {
               AggregateTemprature();
           }
           
           // these aggregator will work on airpressure realtime data
           if (AggregatorName.equals("AggregateAirPressure"))
           {
               AggregateAirPressure();
           }
           
            try {
                //Thread will sleep for 5 second
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Aggregator.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }        
      
    }
    
    void AggregateTemprature()
    {
        try{
       // System.out.println("Start : " + AggregatorName +" for Processing of TempratureData");
        System.out.println(SensorProcessed.getAverageTemprature());
        }
        catch (Exception ex)
        {
            System.out.println("No Data Available");
            ex.printStackTrace();
        }
    }
    
    void AggregateAirPressure()
    {
        try
        {
        //System.out.println("Start : " + AggregatorName +" for Processing of AirPressureData");
        System.out.println(SensorProcessed.getAverageAirPressure());
        }
        catch (Exception ex)
        {
            System.out.println("No Data Available");
        }
    }
 
    

}
