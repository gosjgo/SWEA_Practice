package APSBasic_0809;
import java.util.Scanner;

public class SWEA_1984_중간평균값구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		// T 만큼 케이스를 받는다
		for (int i = 1; i <= T; i++) {
			float[] nums = new float[10];

			// 10 개의 숫자들을 배열에 저장한다.
			for (int j = 0; j < 10; j++) {
				nums[j] = sc.nextInt();
			}
			// 선택정렬을 통해 최소값의 index를 index 0이랑 교환한다.
			int minIndex = 0;
			for (int j = 1; j < nums.length; j++) {
				if (nums[minIndex] > nums[j]) {
					minIndex = j;
				}
			}
			swap(nums, 0, minIndex);

			// 선택정렬을 통해 최대값의 index를 index 1이랑 교환한다.
			int maxIndex = 1;
			for (int j = 2; j < nums.length; j++) {
				if (nums[maxIndex] < nums[j]) {
					maxIndex = j;
				}
			}
			swap(nums, 1, maxIndex);

			// 최소값과 최대값을 제외하고 다른 요소들의 합을 저장할 변수 sum 선언
			float sum = 0;
			// index 0과 1에 최소값과 최대값을 저장했으니 제외하고 나머지를 더한다.
			for (int j = 2; j < nums.length; j++) {
				sum += nums[j];
			}
			// 소수점 아래 첫번째 자리수를 변수 firstDecimal로 선언
			float firstDecimal = ((int) ((sum / 8) * 10)) % 10;
			// 평균을 소수점 아래 첫번째 자리수에서 내림한 수를 변수 avgFloor로 선언
			int avgFloor = ((int) ((sum / 8) * 10)) / 10;
			// 최종적으로 반올림한 평균을 저장할 변수 avg 선언
			int avg = 0;
			// 소수점 아래 첫번째 자리수가 5이상이면 avgFloor에서 1를 더한다.
			if (firstDecimal >= 5) {
				avg = avgFloor + 1;
			} else {
				avg = avgFloor;
			}

			System.out.printf("#%d %d\n", i, avg);

		}

	}

	// swap 메서드 만들어놓기
	static void swap(float[] nums, int a, int b) {
		float temp;
		temp = nums[a];
		nums[b] = temp;
		nums[a] = nums[b];
	}
}