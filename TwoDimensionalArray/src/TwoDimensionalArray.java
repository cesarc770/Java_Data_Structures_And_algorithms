/*
Implemented by Cesar Caceres 09/02/2019
 */

public class TwoDimensionalArray {

    int arr[][] = null;

    //constructor
    public TwoDimensionalArray(int rows, int columns) {
        this.arr = new int[rows][columns];

        for(int i = 0; i < this.arr.length; i++) {
            for(int j = 0; j < this.arr[0].length; j++) {
                this.arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    //Traversing array
    public void traverseArray() {
        try {
            for(int i = 0; i < this.arr.length; i++) {
                for(int j = 0; j < this.arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array does not exist");
        }
        System.out.println();
    }

    //Insert into cell
    public void insert(int row, int column, int value) {
        try{
            if(this.arr[row][column] == Integer.MIN_VALUE) {
                this.arr[row][column] = value;

                System.out.println("Value was successfully added to Array!");
            } else {
                System.out.println("Space is already occupied by another value!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index does not exist in Array!");
        }

    }

    //Access specific cell
    public void accessCell(int row, int column) {
        System.out.println("\nAccessing row " + row + " column " + column);
        try {
            System.out.println("Value of cell is: " + this.arr[row][column]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cannot find index number!");
        }
    }

    //Search value in array
    public void search(int value) {
        System.out.println("\nSearching for " + value + " in Array...");

        for(int i = 0; i < this.arr.length; i ++){
            for(int j = 0; j < this.arr[0].length; j++){
                if(this.arr[i][j] == value) {
                    System.out.println(value + " found in row " + i + " column " + j);
                    return;
                }
            }
        }

        System.out.println(value + " was not found in Array!");
    }

    //delete value from cell
    public void delete(int row, int column) {
        System.out.println("\nDeleting from row " + row + " column " + column);
        try{
            this.arr[row][column] = Integer.MIN_VALUE;
            System.out.println("Delete Successful!");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index not found!");
        }
    }

    /*EXTRA: Zero Matrix  from Cracking the coding interview page 91
    if an element of an array is zero set the rest of the elements in that row and column to zero
    */
    public void zeroMatrix() {
        //To store row and column to zeroise
        boolean row[] = new boolean[this.arr.length];
        boolean column[] = new boolean[this.arr[0].length];

        //find column and row
        for(int i = 0; i < this.arr.length; i ++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                if(this.arr[i][j] == 0) {
                   row[i] = true;
                   column[j] = true;
                }
            }
        }

        //zero row
        for(int i = 0; i < this.arr.length; i ++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                if(row[i] == true) {
                    this.arr[i][j] = 0;
                }
            }
        }

        //zero column
        for(int i = 0; i < this.arr.length; i ++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                if(column[j] == true) {
                    this.arr[i][j] = 0;
                }
            }
        }



    }





}
