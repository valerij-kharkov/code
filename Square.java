/*Заполнить квадрат последовательностью чисел начиная с нуля таким образом, чтобы получилась 
спираль.
 */
public class Square {

	static void fill_square(int width) {

		int arr[][] = new int[width][width];
		int posledov = 0;
		int ind_strok_verh = 0, ind_strok_niz = width - 1;
		int ind_stolb_prav = width - 1, ind_stolb_levo = 0;
		int ind_perebor_strokV = 0, ind_perebor_strokN = width - 2;
		int ind_perebor_stolbP = 1, ind_perebor_stolbL = width - 2;

		while (ind_strok_verh < (width / 2 + 1)) {
			while (ind_perebor_strokV <= ind_stolb_prav) {
				arr[ind_strok_verh][ind_perebor_strokV++] = posledov++;
			}
			ind_strok_verh++;
			ind_perebor_strokV = ind_strok_verh;

			while (ind_perebor_stolbP <= ind_strok_niz) {
				arr[ind_perebor_stolbP++][ind_stolb_prav] = posledov++;
			}
			ind_stolb_prav--;
			ind_perebor_stolbP = ind_strok_verh + 1;

			while (ind_perebor_strokN >= ind_stolb_levo) {
				arr[ind_strok_niz][ind_perebor_strokN--] = posledov++;
			}
			ind_strok_niz--;
			ind_perebor_strokN = ind_strok_niz - 1;

			while (ind_perebor_stolbL >= ind_strok_verh) {
				arr[ind_perebor_stolbL--][ind_stolb_levo] = posledov++;
			}
			ind_stolb_levo++;
			ind_perebor_stolbL = ind_strok_niz - 1;

		}

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(" " + arr[i][j]);
				if (j == (width - 1))
					System.out.println();

			}

	}

	public static void main(String[] args) {
		fill_square(7);
	}
}
