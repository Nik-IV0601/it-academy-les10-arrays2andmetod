//Задание 9:
//Напишите код, объявляющий статический метод с именем isPalindrome, который
//принимает один параметр: строку. Метод возвращает значение типа boolean.
//Метод должен принадлежать классу StringOperations, который находится в пакете
//com.example.operations.
//Требования:
//1. Метод должен быть объявлен как public static.
//2. Метод должен принимать один параметр: строку.
//3. Метод должен возвращать значение типа boolean.
//4. Класс должен быть объявлен в пакете com.example.operations.

package com.example.operations;

public class StringOperations {

	public static void main(String[] args) {

		String str = "дельфин";
		System.out.println("В строке " + "'" + str + "'" + " больше трёх символов?");
		System.out.print(isPalindrome(str));

	}

	public static boolean isPalindrome(String str) {

		boolean b = false;
		if (str.length() > 3) {
			b = true;
		}
		return b;
	}

}
