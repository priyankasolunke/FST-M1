package activities;

import java.util.Arrays;

public class Activity4 
{

	static void ascendingSort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i--;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[]) {
        int[] data = { 13,76, 83, 32, 12, 34 };
        ascendingSort(data);
        System.out.println("Sorted Array in Ascending Order is : ");
        System.out.println(Arrays.toString(data));
    }
}

