package rmi.Metadata;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.communication.EventData;

/*
This is major class that is used for Machines and communicate with to generate data
after 0.2 sec interval
 */
public class MachineData {

    public void Start() throws RemoteException, NotBoundException {

        try {
            // Getting the registry 
            Registry registry = LocateRegistry.getRegistry(5000);

            // Looking up the registry for the remote object 
            EventData machine = (EventData) registry.lookup("MachineData");

            while (true) {
                //generate random Temprature as per machine provided data min/max 
                // after generation , we will send this data to server where aggregator will be able to process this data
                int temprature = generateRandom(MinTempratue, MaxTempratue);
                machine.postTemprature(MachineName, temprature);

                //generate random AirPresure as per machine provided data min/max 
                // after generation , we will send this data to server where aggregator will be able to process this data
                int AirPressure = generateRandom(MinAirPressure, MaxAirPressure);
                machine.postAirPressure(MachineName, AirPressure);
                
                System.out.println(MachineName+" Temprature = "+temprature+" AirPressure="+AirPressure);
                //As per our requirment , we add 0.2 sec interval, between server and IOT devices
                Thread.sleep(200);

            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }

    //Generate Random Values 
    private int generateRandom(int max, int min) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    //Store information
    String MachineName;
    int MinTempratue;
    int MaxTempratue;
    int MinAirPressure;
    int MaxAirPressure;

    public MachineData(String MachineName, int MinTempratue, int MaxTempratue, int MinAirPressure, int MaxAirPressure) {
        this.MachineName = MachineName;
        this.MinTempratue = MinTempratue;
        this.MaxTempratue = MaxTempratue;
        this.MinAirPressure = MinAirPressure;
        this.MaxAirPressure = MaxAirPressure;
    }
}
