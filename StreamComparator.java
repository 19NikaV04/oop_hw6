package Урок_6;

// import java.util.concurrent.Flow;

public class StreamComparator {
    
    public int compare(Flow flow1, Flow flow2) {
        int countGroup1 = flow1.count();
        int countGroup2 = flow2.count();

        return Integer.compare(countGroup1, countGroup2);
    }
}
