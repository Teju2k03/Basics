import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

       
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

       
        int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;  
                firstLargest = num;  
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;  
            }
        }


        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements may be the same).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
