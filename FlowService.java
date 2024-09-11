package Урок_6;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Flow;

public class FlowService {

    public List<Flow> sortingFlows(List<Flow> flows) {
        flows.sort(Comparator.comparing(null));
        return flows;
    }
}
