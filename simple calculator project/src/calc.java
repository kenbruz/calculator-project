import java.util.Scanner;//

public class calc{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        char operator;

        System.out.println("+,-,*,/");
        System.out.println("choose operator: ");
       operator = input.next().charAt(0);

        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.printf("'%c' is an invalid operator.\n", operator);
            input.close();
            return;  // Exit the program
        }

        System.out.println("Enter first interger");
         num1 =input.nextDouble();

        System.out.println("Enter Second interger");

         num2 =input.nextDouble();

         input.close();

         switch (operator) {
             case '+':
                 System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1+num2));
                 break;

             case '-':
                 System.out.printf("%.2f - %.2f = %.2f", num1,num2,(num1-num2));
                 break;

             case '*':
                 System.out.printf("%.2f * %.2f = %.2f", num1,num2,(num1*num2));
                 break;

             case '/':
                 if (num2== 0) {
                     System.out.println("Error!Divison by zero is not allowed");
                 }  else {
                     System.out.printf("%C is an invalid input.\n, operator");
                 }
                 break;

             default:
                 System.out.println("calculator closed");
                 break;



         }

    }
}
