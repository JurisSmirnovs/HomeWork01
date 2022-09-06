/**
*Java Basic. Homework #1
*
*@Autor Juris Smirnovs
*@version 5.09.2022
*
*/
class HomeWork01 {
	public static void main(String[] args)
	 {  int a, b, c, d, pizza;
        
        float div, e = 5f, f = 3f, pizzaArea, pii, rr;
		a = 5;
		b = 8;
        c = 5;
        d = 3;
		System.out.println("----------------------------------------------------------------------");
        System.out.println("Hi there!");
        System.out.println("The task 01: Now I'm going to calculate the area and perimeter of the rectangular... ");
		System.out.println("Side a is " + a);
		System.out.println("Side b is " + b);
		System.out.println("The perimeter is " + (a*2 + b*2));
		System.out.println("The area is " + a * b);
        System.out.println("----------------------------------------------------------------------");
		System.out.println("The task 02: Now I'm going to make some calculations... ");
        System.out.println("The number a is " + c);
		System.out.println("The number b is " + d);
        System.out.println("a + b = " + (c + d));
		System.out.println("a - b = " + (c - d));
        System.out.println("b - a = " + (d - c));
        System.out.println("a * b = " + (c * d));
        div = e/f;
        System.out.println("a / b = " + div);
        div = d/c;
        System.out.println("b / a = " + div);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("The task 03: This would be like a beginning with massives... ");
        int[] array = new int[5];
        array[0]=10;
        array[1]=9;
        array[2]=8;
        array[3]=-12;
        array[4]=4;
        System.out.println("Massive element 1 is " + array[0]);
        System.out.println("Massive element 1 is " + array[1]);
        System.out.println("Massive element 1 is " + array[2]);
        System.out.println("Massive element 1 is " + array[3]);
        System.out.println("Massive element 1 is " + array[4]);
        System.out.println("----------------------------------------------------------------------");
        //Pizzatime :) 
        pizza = 28;
        pii = 3.14f;
        
        System.out.println("The task 04: The value of your pizza today: " + pizza + " cm");
        pizza = pizza/2;
        int cal = 40;
        pizzaArea = pii * pizza * pizza; 
        //System.out.println("Area pizza: " + pizzaArea);
        System.out.println("Energetic value of the pizza: " + (pizzaArea * cal)/1000 + " kcal...");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Thank you for your attention" );
	 }
				}