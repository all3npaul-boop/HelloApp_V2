/**
* HelloApp.java A simple Java application that Displays "Hello, World!" to
* the console.
*
* This is the first step in the HelloApp journey, where we start with a basic
* "Hello, World!" program. The application consists of a single class with a
* main method that serves as the entry point for the program. The main method
* uses the System.out.println() function to print the message "Hello, World!"
* to the console. This application demonstrates fundamental Java concepts such
* as class declaration, the main method, and standard output.
*
* @author Allen
* @version 1.0
*@since UC1
*/
/**
* Key Java Concepts Used:
*1.Command-Line Arguments: Accessing user input via args[] parameter
*2.String Concatenation: Combining strings using the + operator
*3.System.out.println(): Output to console
*4.Array Indexing: Accessing the first arugumet with args[0]
*/
public class HelloApp {
public static void main(String[] args) {
    String name = args[0];
    System.out.println("Hello,"+name+"!");
   }
}
