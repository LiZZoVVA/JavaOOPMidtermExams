package t1;

/**
 * This program processes two lists (list1 and list2) to generate a third list (list3).
 * 
 * The program works as follows:
 * 1. list1 contains integer values that serve as indices for list2
 * 2. For each value in list1, we get the corresponding element from list2 at that index
 * 3. These elements are collected to form list3
 * 
 * The program is designed to work with any valid input lists of the same structure.
 * It includes error handling for cases where indices in list1 are out of bounds for list2.
 * 
 * Example from the image:
 * list1: [10, 8, 4, 1, 6, 7, 2, 9, 5, 3]
 * list2: ["jdp", "kpw", "zpk", "wnu", "gus", "whn", "cvw", "hpu", "efc", "uuq", "njd", "zpb"]
 * 
 * The program will use the values in list1 as indices to select elements from list2:
 * - 10 -> "njd"
 * - 8 -> "efc"
 * - 4 -> "gus"
 * - 1 -> "kpw"
 * - 6 -> "cvw"
 * - 7 -> "hpu"
 * - 2 -> "zpk"
 * - 9 -> "uuq"
 * - 5 -> "whn"
 * - 3 -> "wnu"
 * 
 * Resulting list3: ["njd", "efc", "gus", "kpw", "cvw", "hpu", "zpk", "uuq", "whn", "wnu"]
 */
public class Listprocessor {
    public static void main(String[] args) {
        // Predefined list1 with integer values (acting as indices for list2)
        int[] list1 = {10, 8, 4, 1, 6, 7, 2, 9, 5, 3};
        
        // Predefined list2 with string values
        String[] list2 = {"jdp", "kpw", "zpk", "wnu", "gus", "whn", "cvw", "hpu", "efc", "uuq", "njd", "zpb"};
        
        // Initialize list3 with the same length as list1
        String[] list3 = new String[list1.length];
        
        // Process each element in list1 to populate list3
        for (int i = 0; i < list1.length; i++) {
            try {
                // Get the index from list1 and use it to get the corresponding element from list2
                int index = list1[i];
                list3[i] = list2[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle case where index is out of bounds for list2
                System.err.println("Error: Index " + list1[i] + " from list1 is out of bounds for list2");
                list3[i] = null; // or you could use a default value
            }
        }
        
        // Print the results
        System.out.println("list1 (indices):");
        printArray(list1);
        
        System.out.println("\nlist2 (values):");
        printArray(list2);
        
        System.out.println("\nlist3 (result):");
        printArray(list3);
    }
    
    /**
     * Helper method to print an array of integers
     * @param array the array to print
     */
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
    
    /**
     * Helper method to print an array of strings
     * @param array the array to print
     */
    private static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}