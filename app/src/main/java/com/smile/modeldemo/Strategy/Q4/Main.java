package com.smile.modeldemo.Strategy.Q4;

public class Main {
    public static void main(String[] args) {
        String[] data = {
            "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        SortAndPrint sap = new SortAndPrint(data, new SecondSorter());
        sap.execute();
    }
}
