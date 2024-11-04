//Задание 1:
//Напишите код, объявляющий метод с именем merge, который принимает два
//параметра: два одномерных массива строк. Метод возвращает значение типа
//String[]. Метод должен принадлежать классу ArrayOperations, который находится в
//пакете com.example.operations.
//Требования:
//1. Метод должен быть объявлен как public.
//2. Метод должен принимать два параметра: два одномерных массива строк.
//3. Метод должен возвращать значение типа String[].
//4. Класс должен быть объявлен в пакете com.example.operations.
package com.example.operations;

public class ArrayOperations {

	public static void main(String[] args) {

		String[] arrStr1 = { "I", "T" };
		String[] arrStr2 = { "A", "k", "a", "d", "e", "m", "y" };

		print(arrStr1);
		print(arrStr2);
		print(merge(arrStr1, arrStr2));
	}

	public static String[] merge(String[] arr1, String[] arr2) {

		String[] arrStr = new String[arr1.length + 1 + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			arrStr[i] = arr1[i];
		}
		arrStr[arr1.length] = "-";
		for (int i = 0; i < arr2.length; i++) {
			arrStr[arr1.length + 1 + i] = arr2[i];
		}

		return arrStr;
	}

	public static void print(String[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

	}

}
