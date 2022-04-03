package com.example.sping_portfolio.controllers.Sort;

import java.util.ArrayList;

public class SelectionSort extends Sorts{

    ArrayList sorted;
    int comparison = 0;
    int swap = 0;
    public SelectionSort(int size) {
        super(size);

    }


    public ArrayList<Integer> sort(ArrayList original) {
        ArrayList<Integer> arr;
        arr = original;
        int n = arr.size();
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr.get(j) < arr.get(min_idx)) {
                    min_idx = j;
                }
                comparison++;
            }

            // Swap the found minimum element with the first
            // element
            swap++;
            int temp = arr.get(min_idx);
            arr.set(min_idx, arr.get(i));
            arr.set(i, temp);
        }
        System.out.println("# of swaps: " + swap + "     # of comparisons: " + comparison);
        return arr;
    }
}
