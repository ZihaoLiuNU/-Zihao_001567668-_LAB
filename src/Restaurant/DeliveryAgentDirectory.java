/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class DeliveryAgentDirectory {
    ArrayList<DeliveryAgent> agentList;

    public DeliveryAgentDirectory() {
        this.agentList = new ArrayList<DeliveryAgent>();
    }

    public ArrayList<DeliveryAgent> getAgentList() {
        return agentList;
    }

    public void setAgentList(ArrayList<DeliveryAgent> agentList) {
        this.agentList = agentList;
    }
    
    
    public DeliveryAgent findById(String id) {
        for (DeliveryAgent da : this.agentList) {
            if (da.getPersonID().equals(id)) {
                return da;
            }
        }
        return null;
    }

    public DeliveryAgent createDeliveryAgent(String id, String name, String age) {
        DeliveryAgent da = new DeliveryAgent();
        da.setPersonID(id);
        da.setName(name);
        da.setAge(age);

        this.agentList.add(da);
        return da;
    }
}
