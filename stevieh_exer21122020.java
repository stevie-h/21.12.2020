// https://qaarchint.files.wordpress.com/2020/12/javaexercises.pdf

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner prn = new Scanner(System.in);
        Random r = new Random();

        //ex4
        int x4 = 5;
        int y4 = 12 + 20;
        float z4 = 7.5f;

        //ex5
        int a, b;
        //int sum = a + b;
        //int multiply = a * b;

        //ex6
        String colour = "grass";

        //ex7
        System.out.println("Please enter your name: ");
        String name = prn.nextLine();
        System.out.println(String.format("Hello %s, welcome to Java!", name));

        //ex8
        int year = 2020;
        year += 10;
        year -= 30;
        System.out.println("The result is: " + year);    //this will print 2000

        //ex9
        System.out.println("Please enter three numbers: ");
        int x9 = prn.nextInt();
        int y9 = prn.nextInt();
        int z9 = prn.nextInt();
        System.out.println(String.format("Average of the three numbers (rounded down): %d", (x9 + y9 + z9)/3));

        //ex10
        System.out.println("Please enter the driving speed: ");
        int speed = prn.nextInt();
        if (speed > 120)
        {
            System.out.println("Too fast!");
        }
        else if (speed < 80)
        {
            System.out.println("Too slow!");
        }
        else
        {
            System.out.println("Good driver.");
        }

        //ex11
        System.out.println("Please enter the age of the first sibling: ");
        short sib1_age = prn.nextShort();
        System.out.println("Please enter the age of the second sibling: ");
        short sib2_age = prn.nextShort();
        if (sib1_age > sib2_age)
        {
            System.out.println("First sibling is older");
        }
        else if (sib2_age > sib1_age)
        {
            System.out.println("Second sibling is older");
        }
        else
        {
            System.out.println("Must be twins");
        }

        //ex12
        System.out.println("Please enter two numbers: ");
        int x12 = prn.nextInt();
        int y12 = prn.nextInt();
        if (x12 == y12)
        {
            System.out.println("Equal");
        }
        else
        {
            if (x12 < y12)
            {
                System.out.println("The smaller number is " + x12);
            }
            else
            {
                System.out.println("The smaller number is " + y12);
            }
        }

        //ex13
        System.out.println("Please enter three numbers: ");
        int x13 = prn.nextInt();
        int y13 = prn.nextInt();
        int z13 = prn.nextInt();
        System.out.print("The middle number is: ");
        if (x13 >= y13)
        {
            if (y13 >= z13)
            {
                System.out.println(y13);
            }
            else if (z13 >= x13)
            {
                System.out.println(x13);
            }
            else
            {
                System.out.println(z13);
            }
        }
        else               // x13 < y13
        {
            if (y13 <= z13)
            {
                System.out.println(y13);
            }
            else if (z13 <= x13)
            {
                System.out.println(x13);
            }
            else
            {
                System.out.println(z13);
            }
        }

        //ex14
        System.out.println("Please enter two numbers: ");
        int x14 = prn.nextInt();
        int y14 = prn.nextInt();
        if (x14 <= y14)
        {
            System.out.println(String.format("The numbers in order are %d, %d", x14, y14));
        }
        else
        {
            System.out.println(String.format("The numbers in order are %d, %d", y14, x14));
        }

        //ex15
        System.out.println("The numbers from 0 to 10 are: ");
        for (int index = 0; index <= 10; index++)
        {
            System.out.print(index + " ");
        }
        System.out.println();

        //ex16
        System.out.println("The odd numbers from 1 to 50 are: ");
        for (int index = 1; index <= 50; index += 2)
        {
                System.out.print(index + " ");
        }
        System.out.println();

        // version 2 for hachmologim (or non-hachmologim):
        for (int index = 1; index <= 50; index++)
        {
            if (index % 2 != 0)
            {
                System.out.print(index + " ");
            }
        }
        System.out.println();

        //ex17
        System.out.println("Random numbers between 10 and 30, until 15 comes up: ");
        int r17 = r.nextInt(21) + 10;
        do
        {
            System.out.print(r17 + " ");
            r17 = r.nextInt(21) + 10;
        }
        while (r17 != 15);
        System.out.println();

        //ex18
        System.out.println("Please enter a number: ");
        int x18 = prn.nextInt();
        switch (x18)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Unknown number");
        }

        //ex19
        int sum19 = 0;
        while (true)
        {
            System.out.println("Please enter a number, 0 to quit: ");
            int x19 = prn.nextInt();
            if (x19 == 0)
            {
                break;
            }
            sum19 = sum19 + x19;
        }
        System.out.println("The sum is: " + sum19);

        //ex20
        System.out.println("Please enter a 3-digit number: ");
        int x20 = prn.nextInt();
        if (x20 > 999 || (x20 < 100 && x20 > -100) || x20 < -999)
        {
            System.out.println("Invalid number");
        }
        else
        {
            System.out.println("The hundreds digit is: " + (x20 / 100));
        }

        //ex21
        int sum21 = 0;
        int num_grades21 = 0;
        int x21;
        while (true)
        {
            System.out.println("Please enter a grade, -1 to quit: ");
            x21 = prn.nextInt();
            if (x21 == -1)
            {
                break;
            }
            sum21 = sum21 + x21;
            num_grades21++;
        }
        if (num_grades21 == 0)
        {
            System.out.println("Ended");
        }
        else
        {
            System.out.println("The average (rounded down) is: " + sum21 / num_grades21);
        }

        //ex22
        System.out.println("Please enter a number: ");
        int x22 = prn.nextInt();
        int index22;
        int fact22 = 1;
        for (index22 = 1; index22 <= x22; index22++)
        {
            fact22 = fact22 * index22;
        }
        System.out.println(String.format("The factorial of %d is: %d", x22, fact22));

        //ex23
        System.out.println("Please enter positive numbers; negative number to quit: ");
        int largest23 = 0;
        int x23;
        do
        {
            x23 = prn.nextInt();
            if (x23 > largest23)
            {
                largest23 = x23;
            }
        }
        while (x23 >= 0);
        System.out.println("The largest number entered is " + largest23 + " (or no numbers were entered)");

        //ex24
        System.out.println("Please enter length of line to be drawn: ");
        int length24 = prn.nextInt();
        while (length24 > 0)
        {
            System.out.print("-");
            length24--;
        }
        System.out.println();

        //ex25
        int ppl_in25 = 0;
        int ppl_out25 = 0;
        do
        {
            System.out.println("Please enter temperature; -1 to quit: ");
            int temperature = prn.nextInt();
            if (temperature == -1)
            {
                break;
            }
            if (temperature <= 37)
            {
                System.out.println("Welcome");
                ppl_in25++;
            }
            else
            {
                System.out.println("Sorry, you cannot enter");
                ppl_out25++;
            }

        }
        while (true);
        System.out.println(String.format("The number of people let in: %d", ppl_in25));
        System.out.println(String.format("The number of people sent home: %d", ppl_out25));

        //ex26
        int cor_guesses26 = 0;
        int index26;
        System.out.println("Please guess three different numbers between 1 and 100: ");
        for (index26 = 3; index26 > 0; index26--)
        {
            int num26 = r.nextInt(100) + 1;
            int x26 = prn.nextInt();
            if (num26 == x26)
            {
                cor_guesses26++;
            }
        }
        switch (cor_guesses26)
        {
            case 1:
                System.out.println("You won 100 NIS!");
                break;
            case 2:
                System.out.println("You won 100,000 NIS!");
                break;
            case 3:
                System.out.println("You won the big prize, 1,000,000 NIS!");
                break;
            default:
                System.out.println("You didn't win anything...");
        }
        System.out.println();

        //ex27
        System.out.println("Welcome to the payroll calculation. Quit by entering -1");
        while (true)
        {
            System.out.println("Please enter hourly rate: ");
            int h_rate27 = prn.nextInt();
            if (h_rate27 == -1)
            {
                break;
            }
            System.out.println("Please enter number of working hours: ");
            int h_work27 = prn.nextInt();
            if (h_work27 == -1)
            {
                break;
            }
            int totalpay = h_rate27 * h_work27;
            System.out.print("The pay minus tax is: ");
            if (totalpay < 1000)
            {
                System.out.println(totalpay * 0.98);
            }
            else if (totalpay <= 5000)
            {
                System.out.println(totalpay * 0.90);
            }
            else
            {
                System.out.println(totalpay * 0.80);
            }
        }
        System.out.println();

        //ex28
        System.out.println("Rock Paper Scissors!");
        System.out.print("Please enter your choice: ");
        System.out.println("1 - Rock, 2 - Paper, 3 - Scissors");
        int player28 = prn.nextInt();
        int comp28 = r.nextInt(3) + 1;
        switch (comp28)
        {
            case 1:
                System.out.println("Computer chose Rock");
                break;
            case 2:
                System.out.println("Computer chose Paper");
                break;
            case 3:
                System.out.println("Computer chose Scissors");
                break;
        }
        if (player28 == comp28)
        {
            System.out.println("It's a tie!");
        }
        else
        {
            if (player28 == 1 && comp28 == 3 || player28 == 2 && comp28 == 1 || player28 == 3 && comp28 == 2)
            {
                System.out.println("You win!");
            }
            else
            {
                System.out.println("You lose!");
            }
         }

    }
}
    
    
    
    
    
