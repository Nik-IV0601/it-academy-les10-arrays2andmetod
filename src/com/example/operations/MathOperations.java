//Задание 5:
//Напишите код, объявляющий статический метод с именем findMax, который
//принимает два параметра: одномерный массив чисел с плавающей запятой
//и строку. Метод возвращает значение типа double. Метод должен
//принадлежать классу MathOperations, который находится в пакете
//com.example.operations.
//Требования:
//1. Метод должен быть объявлен как public static.
//2. Метод должен принимать два параметра: одномерный массив чисел с
//плавающей запятой и строку.
//3. Метод должен возвращать значение типа double.
//4. Класс должен быть объявлен в пакете com.example.operations.

package com.example.operations;

public class MathOperations {

	public static void main(String[] args) {

		String str = "сумма";
		double[] d = { 42.8, 0.5 };
		System.out.println(findMax(d, str));

	}

	public static double findMax(double[] arr, String str) {
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (str == "сумма") {
				sum += arr[i]; 
			}	
		}
		return sum;

	}

}
