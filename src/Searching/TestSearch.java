package Searching;

public class TestSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int searchValue = 4;
        Searching linearSearch = new LinearSearch();
        if(linearSearch.search(arr,searchValue)) {
            System.out.println("Found");
        }else
        System.out.println("not found");


    }
}
