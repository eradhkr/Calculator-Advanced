import java.lang.Math;

public class Calculator 
  {

    public static double subtraction(int num1, int num2) 
    {
      return num1-num2;
    }

    public static double addition(int num1, int num2)
    {
     
      return num1+num2;
    }
    public static double division(double num1, double num2)
    {
      
     return num1/num2;
    }
    public static double multiplication(int num1,int num2)
    {
      
      return num1*num2;
    }
    public static double squareRoot(int num1)
    {
      return (Math.sqrt(num1));
    }

    public static double cubeRoot(int num1)
    {
      return (Math.cbrt(num1));
    }

    public static double power(int num1, int num2){
      return(Math.pow(num1,num2)); 
    }
    public static double area(double num1){
      return (Math.PI*(Math.pow(num1,2)));
      
    }

    public static double average(double num1,double num2){
      return ((num1+num2)/2);
    }

    public static double min(int num1,int num2){
      return (Math.min(num1,num2));
      
    }
    public static double max(int num1, int num2){
      return (Math.max(num1,num2));
    }

    public static double percent(int num1, int num2){
      return (num2*(num1/100.0f));
    }
    public static double circumference(int num1){
      return (num1*2)*3.14;
    }

    

    
  }