/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class VitalSignHistory {
    ArrayList<Observation> vitalSignHistory;
    
    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<Observation> ();
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public Observation findObservation(int id){
        for(Observation o: this.vitalSignHistory){
            if(o.getObservationID() == id){
               return o;
            }
        }
        return null;
    }
        
    public Observation createObservation(int observationId, double bloodPressure, double temperture){
        Observation observation = new Observation();
        
        observation.setObservationID(observationId);
        observation.setTemperature(temperture);
        observation.setBloodPressure(bloodPressure);
        
        // add the observation object into the arraylist
        
        this.vitalSignHistory.add(observation);
        return observation;
    }
    
    public Boolean checkObservationIDUnique(int id){
        for(Observation o: this.vitalSignHistory){
            if(o.getObservationID() == id) {
                return false;
            }
        }
        return true;
    }
    
}
