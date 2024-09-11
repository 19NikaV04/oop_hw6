package Урок_6;

import java.util.List;
import java.util.concurrent.Flow;

public class Controller {
    
    private FlowService flowservice;

    public Controller(FlowService flowservice1) {
        this.flowservice = flowservice1;
    }

    public void sortingFlows(List<Урок_6.Flow> flows) {
        flowservice.sortingFlows(flows);
    }
}
