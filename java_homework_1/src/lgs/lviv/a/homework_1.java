package lgs.lviv.a;

public class homework_1 {
	public static void main(String[] args) {

//  1. Написати по одній змінній кожного типу примітивних типів даних:

//-----------------------------------------------------------------------
		
//		1) тип даних int / byte / long / short
//		
//    	 int   i = 4 + 5;
//       byte  b = -128 + 127;
//       short s = 22223 + 1;
//       long  l = 334+11232143;
//       System.out.println (i);
//       System.out.println (b);
//       System.out.println (s);
//       System.out.println (l);
		
//-----------------------------------------------------------------------
		
//		2) тип даних char / int

//		char a = 85;
//		int b = (int) a;
//		System.out.println("a corresponds with " + b);
		
//-----------------------------------------------------------------------

//		3) тип даних String, не є примітивним але я вписав))

//		String s1 = "I have ";
//		String s2 = " apples ";
//		int num = 3;
//		String s = s1 + num + s2;
//		System.out.println(s);
		
//-----------------------------------------------------------------------

//		4) тип даних boolean

//		boolean user = false;
//        
//		if(user == true) {
//		     System.out.println("true");
//		}
//		else {
//		     System.out.println("false");
//		}
		
//-----------------------------------------------------------------------
		
//		5) тип даних double / float
		
//		double b1 = 3.62;
//		double b2 = 4.12 + b1;
//	
//		float pi = 3.14f;
//		float pipi = (float) 3.14; // інший вид запису флоата такий як зверху
//		double d = 27;
//		double c = pi * d;
//		System.out.println(b2);
//		System.out.println(c);
		
//-----------------------------------------------------------------------

//  2. Вивести на консоль мінімальне та максимальне значення типів даних:
		
//		Integer a = 3;
//		Byte b = 12;
//		
//		System.out.println("Мінімальне значення = "+a);
//		System.out.println("Максимальне значення = "+b);

//-----------------------------------------------------------------------		
	
//  3. Створити масив, наповнити його 10ма заченнями типу int, 
//	   знайти мінімальне та максимальне значення в масиві:
		

		int numbers[] = { 13, 24, 53, -16, 5, 8, 32, 2, 71, 10 };
		int min, max;
		min = max = numbers[0];

		for (int i = 1; i < 10; i++) {
			if (numbers[i] < min)
				min = numbers[i];
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Мінімальне значення з масиву: " + min);
		System.out.println("Максимальне значення з масиву: " + max);
	}
}
