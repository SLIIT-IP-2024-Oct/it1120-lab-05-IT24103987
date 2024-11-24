import java.util.Scanner;

   public class IT24103987Lab5Q2 {

      public static void main(String[] args) {

       //Declair the variables
       int newMembers;

       //Prompt the user to read the input
       Scanner input=new Scanner(System.in);

       //Prompt the user to enter the new members
       System.out.println("Enter the number of new mwmbers");
       newMembers=input.nextInt();

       //The prizes the costomers entitled to
       switch(newMembers)
       {
          case 0:System.out.println("no prizes:");
                 break;

          case 1:System.out.println("pen:");
                 break;
             
          case 2:System.out.println("umbrella:");
                 break;

          case 3:System.out.println("bag:");
                 break;

          case 4:System.out.println("travelling chair:");
                 break;

          default:System.out.println("headphones:");
          }

          //Validate the entered number
          if(newMembers<0)
          {
                System.out.println("Invalid input.Input must be a 0 or greater:");
          }


          }

}











       
      