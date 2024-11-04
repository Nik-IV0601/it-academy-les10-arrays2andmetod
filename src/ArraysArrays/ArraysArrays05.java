//Задача 5: Транспонирование матрицы
//Напишите метод, который транспонирует матрицу, то есть меняет строки и столбцы местами. Метод должен работать для любых прямоугольных матриц.
//Input: [1, 2, 3],
//        [4, 5, 6]]
//Output: [[1, 4],
//         [2, 5],
//         [3, 6]]

package ArraysArrays;

public class ArraysArrays05 {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
				
		print(matrix);
		System.out.println();
		print(transposeMatrix(matrix));
		
	}

	public static void print(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("[%2d]", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] transposeMatrix(int[][] matrix) {
		
		int[][] tMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				tMatrix[j][i] = matrix[i][j];
			}
		}
		return tMatrix;
	}
}