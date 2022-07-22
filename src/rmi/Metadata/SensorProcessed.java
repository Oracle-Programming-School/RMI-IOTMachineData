/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.Metadata;

import java.util.ArrayList;

/**
 *
 * @author m.faisal1521
 */
public class SensorProcessed {

    //Array List to store Temprate & Air Pressure Transaction after each 0.2 second
    public static ArrayList<Data> tempratureList = new ArrayList<Data>();
    public static ArrayList<Data> AirPressureList = new ArrayList<Data>();

    public static String AverageTemprature;
    public static String AverageAirPressure;

    public static String getAverageTemprature() {
        /// Get data for Cutting machine
        int l_cuttingMachineValue = 0;
        int l_cuttingMachineCount = 0;
        int l_cuttingMachineAVG = 0;

        /// Get data for Molding machine
        int l_MoldingMachineValue = 0;
        int l_MoldingMachineCount = 0;
        int l_MoldingMachineAVG = 0;

        /// Get data for Molding machine
        int l_PrintingMachineValue = 0;
        int l_PrintingMachineCount = 0;
        int l_PrintingMachineAVG = 0;

        // Get Data of array from last 50 sample 
        for (int i = 0; i < tempratureList.size() - 1; i++) {
            //Break after last 50 records 
            if (i == 50) {
                break;
            }

            Data tm = new Data();
            tm = tempratureList.get((tempratureList.size() - 1) - i);

            // Calculate information 
            if (tm.MachineName.equals("CuttingMachine")) {
                l_cuttingMachineValue = l_cuttingMachineValue + tm.value;
                l_cuttingMachineCount = l_cuttingMachineCount + 1;
            }

            // Calculate information 
            if (tm.MachineName.equals("MoldingMachine")) {
                l_MoldingMachineValue = l_MoldingMachineValue + tm.value;
                l_MoldingMachineCount = l_MoldingMachineCount + 1;
            }

            // Calculate information 
            if (tm.MachineName.equals("PrintingMachine")) {
                l_PrintingMachineValue = l_PrintingMachineValue + tm.value;
                l_PrintingMachineCount = l_PrintingMachineCount + 1;
            }

        }

        if (l_cuttingMachineCount > 0) {
            l_cuttingMachineAVG = (l_cuttingMachineValue / l_cuttingMachineCount);
        }

        if (l_MoldingMachineCount > 0) {
            l_MoldingMachineAVG = (l_MoldingMachineValue / l_MoldingMachineCount);
        }

        if (l_PrintingMachineCount > 0) {
            l_PrintingMachineAVG = (l_PrintingMachineValue / l_PrintingMachineCount);
        }

        //if record is available for total avg
        if (l_cuttingMachineCount
                + l_MoldingMachineCount + l_PrintingMachineCount > 0) {
            AverageTemprature = ("Average Tempratue Calculation for all Sensor : " + ((l_cuttingMachineValue + l_MoldingMachineValue + l_PrintingMachineValue) / (l_cuttingMachineCount + l_MoldingMachineCount + l_PrintingMachineCount))
                    + " For each | CuttingMachine = " + l_cuttingMachineAVG
                    + " , MoldingMachine = " + l_MoldingMachineAVG
                    + " , PrintingMachine = " + l_PrintingMachineAVG);
        }

        return AverageTemprature;
    }

    public static String getAverageAirPressure() {
        
        
        /// Get data for Cutting machine
        int l_cuttingMachineValue = 0;
        int l_cuttingMachineCount = 0;
        int l_cuttingMachineAVG = 0;

        /// Get data for Molding machine
        int l_MoldingMachineValue = 0;
        int l_MoldingMachineCount = 0;
        int l_MoldingMachineAVG = 0;

        /// Get data for Molding machine
        int l_PrintingMachineValue = 0;
        int l_PrintingMachineCount = 0;
        int l_PrintingMachineAVG = 0;
        
        
        // Get Data of array from last 100 sample 
        for (int i = 0; i < AirPressureList.size() - 1; i++) {
            //Break after last 50 records 
            if (i == 100) {
                break;
            }

            Data tm = new Data();
            tm = AirPressureList.get((AirPressureList.size() - 1) - i);
            
            // Calculate information 
            if (tm.MachineName.equals("CuttingMachine")) {
                l_cuttingMachineValue = l_cuttingMachineValue + tm.value;
                l_cuttingMachineCount = l_cuttingMachineCount + 1;
            }

            // Calculate information 
            if (tm.MachineName.equals("MoldingMachine")) {
                l_MoldingMachineValue = l_MoldingMachineValue + tm.value;
                l_MoldingMachineCount = l_MoldingMachineCount + 1;
            }

            // Calculate information 
            if (tm.MachineName.equals("PrintingMachine")) {
                l_PrintingMachineValue = l_PrintingMachineValue + tm.value;
                l_PrintingMachineCount = l_PrintingMachineCount + 1;
            }
        }

        if (l_cuttingMachineCount > 0) {
            l_cuttingMachineAVG = (l_cuttingMachineValue / l_cuttingMachineCount);
        }

        if (l_MoldingMachineCount > 0) {
            l_MoldingMachineAVG = (l_MoldingMachineValue / l_MoldingMachineCount);
        }

        if (l_PrintingMachineCount > 0) {
            l_PrintingMachineAVG = (l_PrintingMachineValue / l_PrintingMachineCount);
        }

        //if record is available for total avg
        if (l_cuttingMachineCount + l_MoldingMachineCount + l_PrintingMachineCount > 0) {
            AverageAirPressure = ("Average AirPressure Calculation for all Sensor : " + ((l_cuttingMachineValue + l_MoldingMachineValue + l_PrintingMachineValue) / (l_cuttingMachineCount + l_MoldingMachineCount + l_PrintingMachineCount))
                    + " For each | CuttingMachine = " + l_cuttingMachineAVG
                    + " , MoldingMachine = " + l_MoldingMachineAVG
                    + " , PrintingMachine = " + l_PrintingMachineAVG);
        }

        return AverageAirPressure;
    }

}
