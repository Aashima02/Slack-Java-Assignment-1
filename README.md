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
OUTPUT:

![q1](https://user-images.githubusercontent.com/93427086/224466645-b04c6282-94ac-44c6-8c78-6e302c0855de.png)

### 2. Write a Java program to compare two numbers
```java
import java.util.Scanner;
public class compare_num
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        compare(a,b);
    }
    public static void compare(int n1,int n2)
    {
        if(n1 > n2)
        {
            System.out.println(n1+" greater than "+n2);
        }
        else if(n2 > n1)
        {
            System.out.println(n2+" greater than "+n1);
        }
        else
        {
            System.out.println("Both the numbers are equal");
        }
    }
}

```
OUTPUT:

![q2](https://user-images.githubusercontent.com/93427086/224466762-2103818c-d7de-4256-a840-0848ce0d7bad.png)

### 3. Write a Java program to convert a string to an integer
```java
import java.util.Scanner;
public class typecasting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        int num=Integer.parseInt(str);
        System.out.println("The number is: "+num);
    }
}

```
OUTPUT:

![Q3](https://user-images.githubusercontent.com/93427086/224466827-f9375467-2351-4a87-bb9b-cf656e40c72b.png)

### 4. Java Program to find area of rhombus
```java
import java.util.Scanner;
public class rhombus
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of first diagonal: ");
        float d1 = sc.nextFloat();
        System.out.print("Enter length of second diagonal: ");
        float d2 = sc.nextFloat();
        float area = (d1*d2)/2;
        System.out.println("Area of Rhombus = "+area);
    }
}

```
OUTPUT:

![Q4](https://user-images.githubusercontent.com/93427086/224466920-fe505c5a-6178-4e38-b956-cb906522f667.png)

### 5. Write a Java program to find the number of days in a month
```java
import java.util.Scanner;
public class days
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month no. : ");
        int month = sc.nextInt();
        switch(month)
        {
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Enter a valid month.");
        }
    }
}

```
OUTPUT:

![Q5](https://user-images.githubusercontent.com/93427086/224466979-dee0e719-13d1-4cc0-a202-16b57d49276f.png)

### 6. Write a Java program to print the even numbers from 1 to 20
```java
public class even
{
    public static void main(String args[])
    {
        int i;
        System.out.println("Even numbers in the range 1 - 20 are:");
        for(i=1;i<=20;i++)
        {
            if(i%2 == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}

```
OUTPUT:

![Q6](https://user-images.githubusercontent.com/93427086/224467040-da94126a-5c5d-44a0-ba13-ef7e7e94d893.png)

### 7. Write a Java program to create a simple calculator
```java
import java.util.Scanner;
public class calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Addition '+'\nSubtraction '-'\nMultiplication '*'\nDivision '/'\n");
        System.out.print("Choose the operation to be performed: ");
        String op = sc.next();
        switch(op)
        {
            case "+":
                System.out.print("Sum = "+(n1+n2));
                break;
            case "-":
                System.out.print("Difference = "+(n1-n2));
                break;
            case "*":
                System.out.print("Product = "+(n1*n2));
                break;
            case "/":
                System.out.print("Quotient = "+(n1/n2));
                break;
            default:
                System.out.print("Enter a valid operation");
        }
    }
}
```
OUTPUT:

![Q7](https://user-images.githubusercontent.com/93427086/224467203-6228a62d-7fab-48bf-9ad5-ca87650cbad9.png)

### 8. Write a Java program to print multiplication table of given number
```java
import java.util.Scanner;
public class multiplication_table
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i;
        System.out.println("Multiplication table of "+num+": ");
        for(i=1;i<=12;i++)
        {
            int prod = num*i;
            System.out.println(num+" x "+i+" = "+prod);
        }
    }
}

```
OUTPUT: 

![q8](https://user-images.githubusercontent.com/93427086/224467300-d955df57-2b15-4c0b-ae5e-364bd42a09a0.png)


























