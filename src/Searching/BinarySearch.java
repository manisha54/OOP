package Searching;

public class BinarySearch implements Searching, Sorting {

// multiple inheritance --using an interface
    @Override
    public boolean search(int[] arr, int searchValue) {
        //Binary search algorithm goes here
        int[] tempArray = sort(arr);
        return false;
    }

    @Override
    public int[] sort(int[] arr) {
        return new int[0];
    }
}
