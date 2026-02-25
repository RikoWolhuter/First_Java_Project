package githubproject;

//importing scanner class for inputs
import java.util.Scanner;


public class GithubProject {
    
    
    //Creating global variables
    //for abstraction
    //used for method
    //for null there is nothing stored
    public static String name1 ="";
    public static String age;
    
    //Creating Scanner object for data entry
    public static Scanner UserInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*
        //Calling methods
        UserInputCode();
        PrintingMethod();
        
        
        //= assignment operator
        
        int myVal = 5;
        System.out.println("Value is:" + myVal);
        
        //% arithmitic operator 
        //Variable is 2
        int modulusSum = 12 % 5;
        
        //=+ assignment operator 
        int Sum = 6;
        
        //Both do same thing, they add one
        Sum = Sum++;
        Sum = Sum + 1;
        
        int Sum1 =+ Sum;
        
        //int myVal == 5;
        */
        final String pass = "Emo";
        
        //Constant Variable
        final double PI = 3.14;
        //PI = 5.41;
        
        //Conditional Statement
        //== comparison operator
        if(pass == "Sammy" && pass == "Einstein" || pass == "Ben"){
            System.out.println("There is a match for Sammy");
        }
        else if(pass.equals("John")){
        System.out.println("There is a match John");
    }     
        else{
            System.out.println("This password is not working!");
        }
        
        
        
        
        
        
        
        
        
        System.exit(0);
    }
    
    //Creating external method for data entry
    //This is a method
   static void UserInputCode(){
        System.out.println
        ("Please enter your name");
        //Using global variable name
        name1 = UserInput.nextLine();
        
        System.out.println
        ("Please enter your age");
        //Using global variable name
        age = UserInput.next();
        
        //local variable 
        //int MySum = 45 * 12;
    }
    
   static void PrintingMethod(){
        //int AddSum = MySum
        
        System.out.println("Hi " +name1+ "! It's"
                + "great to know you live in Cape"
                + "Town and your age is" + age);
    }
   
}


