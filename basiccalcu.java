import java.util.Scanner;
public class basiccalcu{
    public static void main(String[]args){
        int num1;
        int num2;
        int res;
        char operator;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        System.out.println("Enter an operator(+,-,*,/)");
        operator = obj.next().charAt(0);
        switch(operator){
            case'+':res = num1+ num2;
            break;
            case'-':res = num1- num2;
            break;
            case'*':res = num1 * num2;
            break;
            case'/':res = num1 / num2;
            break;
        default: 
        System.out.printf("invalid operator");
        return;
            

        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + res);


    }
}