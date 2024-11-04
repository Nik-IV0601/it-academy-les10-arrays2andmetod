//Задание 3:
//Напишите код, объявляющий статический метод с именем filter, который
//принимает один параметр: одномерный массив целых чисел. Метод не возвращает
//значения. Метод должен принадлежать классу ArrayUtils, который находится в
//пакете com.example.utils.
//Требования:
//1. Метод должен быть объявлен как public static.
//2. Метод должен принимать один параметр: одномерный массив целых чисел.
//3. Метод не должен возвращать значение.
//4. Класс должен быть объявлен в пакете com.example.utils.

//Задание 8:
//Напишите код, объявляющий метод с именем findMin, который принимает один
//параметр: одномерный массив чисел с плавающей запятой. Метод возвращает
//значение типа double . Метод должен принадлежать классу ArrayUtils, который
//находится в пакете com.example.utils.
//Требования:
//1. Метод должен быть объявлен как protected.
//2. Метод должен принимать один параметр: одномерный массив чисел с
//плавающей запятой.
//3. Метод должен возвращать значение типа double.
//4. Класс должен быть объявлен в пакете com.example.utils.

package com.example.utils;

public class ArrayUtils {

	public static void main(String[] args) {

		int[] arr = { -2, 0, 235, 59, 0 };
		printInt(arr);
		filter(arr);
		double[] mas = { -0.2, 0, 0.235, 0.59, 0 };
		printDoub(mas);
		System.out.println("Минимальный элемент массива: " + findMin(mas));

	}

	public static void filter(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				count++;
			}
		}
		System.out.println("Массив содержит неположительных элементов в количестве " + count + "шт");
	}

	protected static double findMin(double[] arr) {

		double min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void printInt(int[] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("[%4d]", matrix[i]);
		}
		System.out.println();
	}

	public static void printDoub(double[] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("[%.3f]", matrix[i]);
		}
		System.out.println();
	}

}
