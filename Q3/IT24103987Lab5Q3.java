import java.util.Scanner;

   public class IT24103987Lab5Q3 {

      public static void main(String[] args) {

       //Declair the fixed values
       int ROOM_CHARGE_PER_DAY=48000;
       int DISCOUNT_3_TO_4_DAYS=10;
       int DISCOUNT_5_OR_MORE_DAYS=20;

       //Declair the variables
       int startDate,endDate,numberOfDays,totalAmount,discountAmount,finalAmount;
       int discountRate=0;

       //Prompt the user to read the input
       Scanner input=new Scanner(System.in);

       //Prompt the user to enter the start date
       System.out.println("Enter the start date");
       startDate=input.nextInt();

       //Prompt the user to enter the end date
       System.out.println("Enter the end date");
       endDate=input.nextInt();

       //Validate the conditions
       if(startDate<1||startDate>31||endDate<1||endDate>31)
       {
            System.out.println("Error:Days must between 1 and 31");
       
       //Exit
       return;
       }

       if(startDate>=endDate)
       {
            System.out.println("Error:Start day must be less the end date");
       
       //Exit
       return;
       }

       //Calculate the number of days reserved
       numberOfDays=endDate-startDate;

       //Identify the discount rate
       if(numberOfDays>=5)
       {
           discountRate=20;
       }
       else if(numberOfDays>=3&&numberOfDays<=4)
       {
              discountRate=10;
       }
       else
       {
             discountRate=0;
       }

       //Calculate the total amount
       totalAmount=numberOfDays*ROOM_CHARGE_PER_DAY;

       //Calculate the discount amount
       discountAmount=(totalAmount*discountRate)/100;

       //Calculate the final amount
       finalAmount=totalAmount-discountAmount;

       //Display the output
       System.out.println("Room charge per day:"+ROOM_CHARGE_PER_DAY);
       System.out.println("Number of days reseved:"+numberOfDays);
       System.out.println("The final amount to be paid is:"+finalAmount);

       }

}

       

       