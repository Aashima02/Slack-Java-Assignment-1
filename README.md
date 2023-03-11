# Slack-Java-Assignment-1
### 1. Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers
```java
import java.util.Scanner;
public class math_calc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiply = "+(a*b));
        System.out.println("Divide = "+(a/b));
        System.out.println("Reminder = "+(a%b));
    }
}
```
