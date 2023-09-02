//importing util package for Scanner class and Random class
import java.util.Scanner;
import java.util.Random;
class GuessingNumber
{
    public static void main(String args[])
    {
        System.out.println("\t\t\t\tNUMBER GUESSING GAME");
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();  //by using random class we are generating random number between the range of 0 to 100...
        int randomNo=rn.nextInt(100);
        int attempts=0,found=0; //attempts variable is for counting the user attempts and found variable is for to continue the game if we want...
        boolean check=true;  
        do
        {
               check=false;
               int chances=0;
               System.out.println("EASY MODE");
               System.out.println("MEDIUM MODE");
               System.out.println("HARD MODE");
               System.out.println();
               System.out.println("1.EASY    2.MEDIUM    3.HARD");
               System.out.println();
               System.out.print("Enter your choice : ");
               int choice=sc.nextInt();
               switch(choice) //this condition will execute based on the your choice
               {
                  case 1:  System.out.println("You have 10 chances...");
                           System.out.println();
                           chances=10;
                           while(0<chances)
                           {
                               System.out.print("Enter a number to guess : ");
                               int userGuess=sc.nextInt(); //taking guessing number from the user...at easy mode
                               if(userGuess>100)
                                    System.out.println("Please Enter within the range of 100 only....");
                               else
                               {
                                    if(userGuess==randomNo)
                                    {
                                        attempts++;    
                                        found=1;       //if userGuess is equals to randomNumber then found=1
                                    }
                                    else if(userGuess>randomNo)
                                    { 
                                        attempts++;
                                        System.out.println("Your guessing number is too high...So,enter again...");  //if userGuess is greater than randomNumber then, that userGuess is 'too high' 
                                        check=true;
                                    }
                                    else if(userGuess<randomNo)
                                    {
                                        attempts++;
                                        System.out.println("Your guessing number is too low...So,enter again...");//if userGuess is less than randomNumber then, that userGuess is 'too low' 
                                        check=true;
                                    }
                               }
                               chances--;  //decreasing the chances when userGuess != randomNumber 
                               if(chances==0)
                               {
                                     System.out.println();
                                     System.out.println("The number to be guessed is : "+randomNo);      //printing the generated number if user uses the all their chances
                                     System.out.println("You uses all the chances, Better Luck Next Time");
                                     break;
                               }
                               if(found==1)
                                     break;
                               System.out.println("You have "+chances+" chances left"); //remembring the user for some lefted chances are there 
                               System.out.println();
                            }
                            break;
                  case 2:  System.out.println("You have 7 chances...");
                           System.out.println();
                           chances=7;
                           while(0<chances)
                           {
                               System.out.print("Enter a number to guess : ");
                               int userGuess=sc.nextInt();
                               if(userGuess>100)
                                    System.out.println("Please Enter within the range of 100 only....");
                               else
                               {
                                    if(userGuess==randomNo)
                                    {
                                        attempts++;    
                                        found=1;     
                                    }
                                    else if(userGuess>randomNo)
                                    { 
                                        attempts++;
                                        System.out.println("Your guessing number is Too high...So,enter again...");  
                                        check=true;
                                    }
                                    else if(userGuess<randomNo)
                                    {
                                        attempts++;
                                        System.out.println("Your guessing number is too low...So,enter again..."); 
                                        check=true;
                                    }
                               }
                               chances--;
                               if(chances==0)
                               {
                                     System.out.println();
                                     System.out.println("The number to be guessed is : "+randomNo);
                                     System.out.println("You uses all the chances, Better Luck Next Time");
                                     break;
                               }
                               if(found==1)
                                     break;
                               System.out.println("You have "+chances+" chances left");
                               System.out.println();
                            }
                            break;
                   case 3:  System.out.println("You have 5 chances...");
                            System.out.println();
                            chances=5;
                            while(0<chances)
                            {
                               System.out.print("Enter a number to guess : ");
                               int userGuess=sc.nextInt(); 
                               if(userGuess>100)
                                    System.out.println("Please Enter within the range of 100 only.....");
                               else
                               {
                                    if(userGuess==randomNo)
                                    {
                                        attempts++;    
                                        found=1;      
                                    }
                                    else if(userGuess>randomNo)
                                    { 
                                        attempts++;
                                        System.out.println("Your guessing number is Too high...So,enter again...");  
                                        check=true;
                                    }
                                    else if(userGuess<randomNo)
                                    {
                                        attempts++;
                                        System.out.println("Your guessing number is Too low..So,enter again...");
                                        check=true;
                                    }
                               }
                               chances--;
                               if(chances==0)
                               {
                                     System.out.println();
                                     System.out.println("The number to be guessed is : "+randomNo);
                                     System.out.println("You uses all the chances, Better Luck Next Time");
                                     break;
                               }
                               if(found==1)
                                     break;
                               System.out.println("You have "+chances+" chances left");
                               System.out.println();
                            }
                            break;
               }
               if(found==1 || chances==0) 
               {
                   if(found==1)
                   {
                    System.out.println();
                    System.out.println("\t\tCONGRATULATIONS "); 
                    System.out.println();
                    System.out.println("You won the match and your attempts are.."+attempts);
                    System.out.println();
                    found=0;
                   }
                    System.out.println();
                    System.out.print("Enter '1' to continue..Enter '0' to exit : "); //if user enters  '1' for(continue)...if user enters  '0' for(exit)...) 
                    int q=sc.nextInt();
                    if(q==1)                //'1' means "want to play again" and '0' "means don't want to play"
                    {
                        System.out.println();
                        randomNo=rn.nextInt(100);
                        check=true;
                        attempts=0;
                    }
                    else
                    {
                        System.out.println();
                        System.out.print("\t\t\t\tTHANK YOU FOR PLAYING");
                        check=false;
                        break;      //don't want to play again..
                    }
                }   
         }while(check);
    }
}