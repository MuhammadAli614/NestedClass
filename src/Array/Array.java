package Array;

public class Array {
    public static void main(String[] args) {
        int x;
        int [] myArray;// declaring an array that will store int
        myArray = new int[4]; // Iniitializing our array to be capable holding a 4 int

        x = 3;
             myArray[0] = x;
             myArray[1] = 3;
             myArray[2] = 0;
             myArray[3] = 1;


             //iterating over an array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[0]);

        }
        /*for (int counter = 0; counter<4; counter++ ){
            myArray [4] = counter;*/

        }
    }

