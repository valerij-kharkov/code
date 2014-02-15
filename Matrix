/*Дана квадратная матрица. Переставляя ее строки и столбцы, 
добиться того, чтобы наибольший элемент оказался в нижнем правом углу.
*/
public class Matrix {

	public static void main(String[] fd) {
		int size = 10;
		int arr[][] = new int[size][size];
		fill_matr(size, arr);
		print(size, arr);
		max_elem(size,arr);
		print(size, arr);

	}

	private static void fill_matr(int size, int[][] arr) {
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				arr[i][j] = (int) (Math.random()*100);
			}
	}

	private static void print(int size, int[][] arr) {
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				System.out.print("  " + arr[i][j]);
				if (j == size - 1)
					System.out.println();
			}
	}

	private static void max_elem(int size, int[][] arr) {
		int arr_stolb[] = new int[size];
		int arr_str[] = new int[size];
		int max = arr[0][0];
		int str = 0, stolb = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++) {
				if (max <= arr[i][j]) {
					max = arr[i][j];
					str = i;
					stolb = j;
				}
			}
		System.out.println("\nМаксимальный элемент матрицы: "+ max);
		System.out.println("Находится в столбце № " +stolb+" и строке № "+str);
		System.out.println("Матрица после изменений: \n");


		if (str != (arr.length - 1)) {
			for (int i = 0; i < arr[0].length; i++) {
				arr_str[i] = arr[arr.length - 1][i];
				arr[arr.length - 1][i] = arr[str][i];
				arr[str][i] = arr_str[i];
			}
		}

		if (stolb != (arr[0].length - 1)) {
			for (int i = 0; i < arr[0].length; i++) {
				arr_stolb[i] = arr[i][arr.length - 1];
				arr[i][arr.length - 1] = arr[i][stolb];
				arr[i][stolb] = arr_stolb[i];
			}
			
			
		}
	}
}
