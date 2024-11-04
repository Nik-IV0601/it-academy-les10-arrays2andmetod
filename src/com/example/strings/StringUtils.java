//Задание 4:
//Напишите код, объявляющий метод с именем convert, который принимает один
//параметр: строку. Метод возвращает значение типа int. Метод должен
//принадлежать классу StringUtils, который находится в пакете com.example.strings.
//Требования:
//1. Метод должен быть объявлен как protected.
//2. Метод должен принимать один параметр: строку.
//3. Метод должен возвращать значение типа int.
//4. Класс должен быть объявлен в пакете com.example.strings.

//Задание 7:
//Напишите код, объявляющий метод с именем concatenate, который принимает два
//параметра: две строки. Метод возвращает значение типа String. Метод должен
//принадлежать классу StringUtils, который находится в пакете com.example.strings.
//Требования:
//1. Метод должен быть объявлен как private.
//2. Метод должен принимать два параметра: две строки.
//3. Метод должен возвращать значение типа String.
//4. Класс должен быть объявлен в пакете com.example.strings.

package com.example.strings;

public class StringUtils {

	public static void main(String[] args) {

		String str = "В этой строке ";
		String str1 = "символов ";
		String str2 = "Три";

		System.out.println(str2);
		System.out.println(concatenate(str, str1) + convert(str2));

	}

	protected static int convert(String str) {

		return str.length();
	}

	private static String concatenate(String str, String str1) {

		String str3 = str.concat(str1);

		return str3;
	}

}
