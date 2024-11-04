//Задание 2:
//Напишите код, объявляющий метод с именем calculate, который не принимает
//параметров. Метод возвращает значение типа double. Метод должен принадлежать
//классу MathUtils, который находится в пакете com.example.math.
//Требования:
//1. Метод должен быть объявлен как private.
//2. Метод не должен принимать параметры.
//3. Метод должен возвращать значение типа double.
//4. Класс должен быть объявлен в пакете com.example.math.

//Задание 6:
//Напишите код, объявляющий статический метод с именем sum, который принимает
//один параметр: одномерный массив целых чисел. Метод возвращает значение
//типа int. Метод должен принадлежать классу MathUtils, который находится в
//пакете com.example.math.
//Требования:
//1. Метод должен быть объявлен как public static.
//2. Метод должен принимать один параметр: одномерный массив целых чисел.
//3. Метод должен возвращать значение типа int.
//4. Класс должен быть объявлен в пакете com.example.math.
package com.example.math;

public class MathUtils {

	public static void main(String[] args) {
		 
		int[] arr = {2, 6, 800, 200};
		System.out.println(calculate());
		System.out.println(sum(arr));
		
	}

	private static double calculate() {

		return 0.123;
	}
	
	public static int sum(int[] arr) {

		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 100) {
				s += arr[i]; 
			}	
		}
		return s;
	}

}
