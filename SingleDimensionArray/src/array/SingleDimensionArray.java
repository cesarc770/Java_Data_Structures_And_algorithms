package array;
/* Implemented this class myself with what was learned in the lesson*/

import jdk.nashorn.internal.runtime.ECMAException;

public class SingleDimensionArray {
    int arr[] = null;


    //Constructor
    public SingleDimensionArray(int size) {
        //instantiate new array with size given
        arr = new int[size];

        //assign a value to each element of the array
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }

    }


    // Print array
    public void traverseArray() {
        try {
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array does not exist");
        }


    }


    //Insert value in array
    public void insert(int location, int value) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Value: " + value + ", Successfully inserted to index: "+ location + " of array.");
            } else {
                System.out.println("Index " + location + " is already been occupied!");
            }

        } catch (Exception e) {
            System.out.println("Invalid index of array");

        }
    }


    // Access a an element in array
    public void accessingCell(int cellNumber) {
        try {
            System.out.println(" Accessing Cell " + cellNumber + " with value: " + arr[cellNumber]);
        } catch (Exception e) {
            System.out.println("Invalid index " + cellNumber + "in array");
        }
    }


    //Search for an element in array
    public void searchInAnArray(int valueToSearch) {
        for( int i = 0; i < arr.length; i++) {
            if(arr[i] == valueToSearch) {
                System.out.println(valueToSearch + " was found in array at index " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " was  not found in array");
    }


    //Delete value from array
    public void deleteValueFromArray(int cell) {
        try {
            if(arr[cell] == Integer.MIN_VALUE) {
                System.out.println("Index " + cell + " is already not occupied");
            } else {
                arr[cell] = Integer.MIN_VALUE;
                System.out.println("Index " + cell + " was successfully deleted");
            }
        } catch (Exception e) {
            System.out.println("Could not find cell number");
        }
    }


    //Delete the entire array
    public void deleteThisArray() {
        arr = null;
        System.out.println("Array has successfully been deleted!");

    }

}
