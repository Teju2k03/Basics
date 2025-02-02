import java.util.Arrays;
import java.util.Scanner;
public class anagram{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second String:");
        String str2 = sc.nextLine();

         if(charsame(str1, str2)){
            System.out.println("Both Strings contains same chars!");
         }
        else
            {
                System.out.println("String doesn't contain the same chars ");
            }
         }
         public static boolean charsame(String str1, String str2) {
           
            if (str1.length() != str2.length()) {
                return false;
            }
    
           
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
    
            Arrays.sort(arr1);
            Arrays.sort(arr2);
    
           
            return Arrays.equals(arr1, arr2);
        }
    }

