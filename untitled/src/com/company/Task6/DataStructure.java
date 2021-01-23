package com.company.Task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStructure {
    private final ArrayList<Integer> list =  new ArrayList<>();
    private final Map<Integer, Integer> position = new HashMap<>();

    public void addData(int k) {
        if(list.contains(k)) return;
        list.add(k);
        position.put(k, list.indexOf(k));
    }

    public void deleteData(int k) {
        if (!position.containsKey(k))
            return;

        int pos = position.get(k);
        position.remove(k);

        if (pos != list.size() - 1) {
            list.set(pos, list.get(list.size() - 1));
            position.put(list.get(pos), pos);
        }
        list.remove(list.size() - 1);
    }

    @Override
    public String toString() {
        return "DataStructure" +
                 list.toString();
    }
}
