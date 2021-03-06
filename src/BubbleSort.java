import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data;
		data = new int[10];
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			data[i] = r.nextInt(100);
			System.out.print(data[i] + " ");
		}		
		System.out.println();

		BubbleSort bs = new BubbleSort();

		bs.bubbleSort(data);
		System.out.println("Bubble sort complete");
		for (int i = 0; i < 10; i++) {			
			System.out.print(data[i] + " ");
		}
	}

	public void bubbleSort(int[] data) {
		int length = data.length - 1;
		int temp = 0;

		for (int path = 0; path < length; path++) {
			for (int i = 0; i < length - path; i++) {
				if (data[i] > data[i + 1]) {
					temp = data[i];
					data[i] = data[i + 1];
					data[i+1] = temp;
				}
			}
		}
	}
}