public class Capacity_Water {
		
	public static void capacity(int[] ar) {
		int i = 1, j = ar.length - 2, 
		result = 0, max = ar[0], max2 = ar[ar.length - 1];
		int max_abs = 0, ind_max = 0;
		
		for (int k = 0; k < ar.length; k++) {
			if (max_abs < ar[k]) {
				max_abs = ar[k];
				ind_max = k;
			}
		}
		while (i <= j) {
			if (i <= ind_max) {
				if (max > ar[i]) {
					result += max - ar[i];
					i++;
				} else {
					max = ar[i];
					i++;
					}
			}
			if (j > ind_max) {
				if (max2 > ar[j]) {
					result += max2 - ar[j];
					j--;
				} else {
					max2 = ar[j];
					j--;
							}

			}
		}
		System.out.println("result " + result);
	}

	public static void main(String[] args) {
  		int[] ar = { 3, 2, 5, 3, 3, 7, 7, 3, 5, 3, 6, 3 };
			capacity(ar);

	}

}
