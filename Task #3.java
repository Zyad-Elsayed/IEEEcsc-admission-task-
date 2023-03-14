package addmission;

import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        System.out.print("Enter the number ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        
        int secondLargest = seclargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
    }
    
    public static int seclargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        
        // handling in case there is only one element 

        if (max2 == Integer.MIN_VALUE) {
            return arr[0];
        }
        
        return max2;
    }
}






	


