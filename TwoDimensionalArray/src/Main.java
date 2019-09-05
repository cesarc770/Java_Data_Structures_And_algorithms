public class Main {

    public static void main(String[] args) {


        System.out.println("Creating 5x5 Array...");
        TwoDimensionalArray tda = new TwoDimensionalArray(5, 5);
        tda.traverseArray();

        System.out.println("Inserting to Array...");
        tda.insert(1,4, 1000001);
        tda.insert(1,4,400);
        tda.insert(6,3,100);
        tda.traverseArray();

        tda.accessCell(1, 4);
        tda.accessCell(6,5);

        tda.search(100);
        tda.search(1000001);
        tda.search(-2147483648);

        System.out.println("\nBefore Deleting...");
        tda.traverseArray();
        tda.delete(0,0);
        tda.delete(5, 8);
        tda.delete(1,4);
        System.out.println("\nAfter Deleting...");
        tda.traverseArray();

        //Extra: adding a zero value and zeroing matrix
        tda.insert(1,3,0);
        tda.traverseArray();
        tda.zeroMatrix();
        tda.traverseArray();

        //What if I do it twice?
        System.out.println("Zero Matrix for second time");
        tda.zeroMatrix();
        tda.traverseArray();

        //what if doing it a third time
        System.out.println("Zero Matrix for third time");
        tda.zeroMatrix();
        tda.traverseArray();

        //added a function to delete all 0
        tda.deleteAll();

        //Extra: adding a zero value and zeroing matrix
        tda.insert(1,3,0);
        tda.traverseArray();

        //Using insert with zero matrix should call insert everytime a 0 is added to a cell
        System.out.println("\nUsing insert for zero matrix\n");
        tda.zeroMatrixWithInsert();
        System.out.println("");
        tda.traverseArray();

        //One more time.. should print errors
        System.out.println("\nUsing insert for zero matrix for a second time\n");
        tda.zeroMatrixWithInsert();
        System.out.println("");
        tda.traverseArray();





    }
}
