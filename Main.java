// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int operation = 1;
    Scanner reader = new Scanner(System.in);

    while(operation > 0 && operation <= 12){
      
      System.out.println("What operation do you want to do?");
      System.out.println("1 for multiplication");
      System.out.println("2 for division");
      System.out.println("3 for addition");
      System.out.println("4 for average of 2 numbers");
      System.out.println("5 for min of 2 numbers");
      System.out.println("6 for max of 2 numbers");
      System.out.println("7 for subtraction");
      System.out.println("8 for percent");
      System.out.println("9 for square root");
      System.out.println("10 for cube root");
      System.out.println("11 for square of a number");
      System.out.println("12 for area of a circle");
      System.out.println("13 for circumference of a circle");
      
      
      operation = reader.nextInt();
      if (operation > 13 || operation <= 0) {
      System.out.println("Invalid input. Please try again.");
      break;
      }



      
      int firstNumber = 0;
      int secondNumber = 0;

      if(operation > 7 && operation < 9){

        System.out.println("Enter the percent: ");
        firstNumber = reader.nextInt();
        System.out.println("Enter the number: ");
        secondNumber = reader.nextInt();

      }

      if(operation < 8){
        System.out.println("Enter the first number: ");
        firstNumber = reader.nextInt();
        System.out.println("Enter the second number: ");
        secondNumber = reader.nextInt();
        
      }

      if(operation > 8 && operation < 12){
        System.out.println("Enter the base: ");
        firstNumber = reader.nextInt();
        
        
      }

      if (operation < 14 && operation > 11){
        System.out.println("Enter the radius: ");
        firstNumber = reader.nextInt();
        
      }
     


     
    
      switch(operation){

        case 1:
          System.out.println("Your answer is " + Calculator.multiplication(firstNumber,secondNumber));
          break;
        case 2:
          System.out.println("Your answer is " + Calculator.division(firstNumber,secondNumber));
          break;
        case 3:
          System.out.println(Calculator.addition(firstNumber,secondNumber));

          break;

        case 4:
          System.out.println("Your answer is " + Calculator.average(firstNumber,secondNumber));
          break;

        case 5:

          System.out.println("The smallest number is " +  Calculator.min(firstNumber,secondNumber)); 

          break;

        case 6:
          System.out.println("The largest number is " + Calculator.max(firstNumber,secondNumber));
          break;
        
        case 7:
          System.out.println("Your answer is " + Calculator.subtraction(firstNumber,secondNumber));
          break;

        case 8:
          System.out.println("Your answer is " + Calculator.percent(firstNumber,secondNumber));
          break;
          
        case 9:
          System.out.println("Your answer is " + Calculator.squareRoot(firstNumber));
          break;
          
        case 10:
          System.out.println("Your answer is " + Calculator.cubeRoot(firstNumber));
          break;
        case 11:
          System.out.println("Your answer is " + Calculator.power(firstNumber,secondNumber));
          break;
        case 12:
          System.out.println("Your answer is " + Calculator.area(firstNumber)); 
          break;

        case 13:
          System.out.println("Your answer is " + Calculator.circumference(firstNumber)); 
          break;

          

      }
    

  


     
  }
    reader.close();
    
  }
  }
    


    

    

    
      
    

      
  
       

    
  