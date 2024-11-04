//Задание 10:
//Напишите код, объявляющий метод с именем multiply, который принимает два
//параметра: два целых числа. Метод возвращает значение типа int. Метод должен
//принадлежать классу MathOperations, который находится в пакете com.example.math.
//Требования:
//1. Метод должен быть объявлен как private.
//2. Метод должен принимать два параметра: два целых числа.
//3. Метод должен возвращать значение типа int.
//4. Класс должен быть объявлен в пакете com.example.math.

package com.example.math;

public class MathOperations {

	public static void main(String[] args) {

		int a = 3;
		int b = 2;
		System.out.print(multiply(a, b));
	}

	public static int multiply(int a, int b) {

		return a * b;
	}

}
