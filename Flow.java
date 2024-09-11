package Урок_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup> {

    private List<StudentGroup> groups;

    public Flow() {
        groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

    public int count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }
}
