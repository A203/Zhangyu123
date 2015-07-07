package day02;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 2, 4, 9, 3, 4, 1 };
		bubble(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}

	}

	public static void bubble(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}

	}

}
