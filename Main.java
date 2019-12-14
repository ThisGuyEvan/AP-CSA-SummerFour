import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Scanner idea from previous assignment allows quick and easy customization upon word choice.
    boolean run = true;
    while (run){
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter your palindrome.");

      String palindrome = userInput.next();
      System.out.println(isPalindrome(palindrome));
      
      System.out.println("\n\n");

      System.out.println("Enter your abecedarian.");
      String abecedarian = userInput.next();
      System.out.println(isAbecedarian(abecedarian));

      System.out.println("Again? (y/other keys)");
      String answer = userInput.next();
      answer  = answer.toLowerCase();
      if (answer.equals("y")){
      }
      else{
        userInput.close();
        break;
      }
    }
        
  }

// This wasn't that hard as opposed to when I first read the assignment.
  public static boolean isPalindrome(String palindrome){
    //Initalizing variables.
    String word = palindrome;
    boolean test;

    int constant = word.length();
    int ticks = word.length() - 1; // Since strings start at 0 
    String newWord = "";  
    //For loop for covering the whole word.
    for (int i = constant; i > 0; i--){
      System.out.println(i);
      newWord += word.charAt(i-1);
      ticks -= 1; // To reverse the string.
    }
//The idea of the method equal came from "Think Java" 9.6
    if (word.equals(newWord)){
      test = true;
    }
    else{
      test = false;
    }

    return test;
  }



  public static boolean isAbecedarian(String abecedarian){
    //Java seems to be using the ASCII values for the alphabet (A = 097, B = 098, .... Z = 122) I found out about this when searching how to attach a value to a character. Because of that research the whole code was rather simple. 
    String word = abecedarian;
    //Initializing the variables.
    boolean test = true;

    int constant = word.length() - 1 ; // Without the -1 the for loop would go out of bounds.
    // For loop to run through the whole word.
    for (int i = 0; i < constant; i++) {
      // I could have put the "word.charAt(i)" in the if to make it simplified, however, if I were to edit this and extend this code (somehow) having a variable assigned to it would be easier.
      char Beta = word.charAt(i);
      char Alpha = word.charAt(i + 1);

      if (Beta < Alpha ){
        test = true;
      }
      else{
        test = false;
        break;
      }
    }

    return test;
  }
  
}