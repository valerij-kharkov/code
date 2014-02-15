public class BinarySearch {

	public static int search(int[] arr, int k) {
		int ind = arr.length / 2, right = arr.length, left = 0;

		if (arr[0] > k) {
			System.out.println("Искомого элемента нет, возможная позиция: ");
			return 0;
		}
		if (k > arr[arr.length - 1]) {
			System.out.println("Искомого элемента нет, возможная позиция: ");
			return (-arr.length);
		} else {
			int count = 0;
			while (arr[ind] != k) {
				if (arr[ind] > k) {
					right = ind;
					ind = (right + left) / 2;

				} else {
					left = ind;
					ind = (right + left) / 2;
				}
				count++;
				if (count > (Math.ceil(Math.log(arr.length))) + 1) {
					System.out
							.println("Искомого элемента нет, возможная позиция: ");
					return (-ind - 1);
				}
			}
		}
		System.out.println("Индекс искомого элемента равен: ");
		return ind;

	}

	public static void main(String[] args) {

		int arr2[] = { 0, 1, 2, 3, 5, 7, 9, 9, 17, 23, 56, 76, 79, 90, 101, 102 };
		System.out.println(search(arr2, 57));

	}

}
