import java.util.Scanner;

   public class IT24103987Lab5Q1 {

      public static void main(String[] args) {

       //Declair the variables
       int number1,number2,number3;
       int largest;
       int smallest;

       //Prompt the user to read the input
       Scanner input=new Scanner(System.in);

       //Prompt the user to enter the number 1
       System.out.println("Enter the first integer");
       number1=input.nextInt();

       
       //Prompt the user to enter the number 2
       System.out.println("Enter the second integer");
       number2=input.nextInt();
       

       //Prompt the user to enter the number 3
       System.out.println("Enter the third integer");
       number3=input.nextInt();


       //Display the numbers
       System.out.println("The numbers are:"+number1+" "+number2+" "+number3);

       
       //Check the largest number
       if(number1>number2&&number1>number3)
       {
          largest=number1;
       }
       else if(number2>number1&&number2>number3)
       {
          largest=number2;
       }
       else 
       {
          largest=number3;
       }
 
       System.out.println("The largest number is:"+largest);

       
       //check the smallest number
       if(number1<number2&&number1<number3)
       {
          smallest=number1;
       }
       else if(number2<number1&&number2<number3)
       {
          smallest=number2;
       }
       else 
       {
          smallest=number3;
       }
 
       System.out.println("The smallest number is:"+smallest);



       }

}