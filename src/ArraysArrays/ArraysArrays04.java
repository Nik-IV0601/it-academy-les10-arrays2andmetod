//Задача 4: Проверка симметрии матрицы
//Напишите метод, который проверяет, является ли двумерный массив симметричным относительно главной диагонали. Если массив симметричен, метод должен вернуть true,
//иначе false.
//Пример:
//Input:
//[1, 2, 3]
//[2, 4, 5]
//[3, 5, 6]
//Output: True

package ArraysArrays;

public class ArraysArrays04 {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3}, {2, 4, 5}, {3, 5, 6}};
		
		print(matrix);
		System.out.println(isSymmetric(matrix));
		
	}

	public static boolean isSymmetric(int[][] matrix) {
		int tr = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if ( i!=j && matrix[i][j] == matrix[j][i]) {
					tr++;
				}
			}
		}
		return tr == (int)(Math.pow(matrix.length, 2) - matrix.length);
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("[%2d]", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
