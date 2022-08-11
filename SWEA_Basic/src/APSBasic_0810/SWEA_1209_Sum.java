package APSBasic_0810;

import java.util.Scanner;

public class SWEA_1209_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[100][100];
		for (int i = 1; i <= 10; i++) {
			int T = sc.nextInt();

			// 100*100 배열에 숫자를 저장한다.
			for (int r = 0; r < 100; r++) {
				for (int c = 0; c < 100; c++) {
					arr[r][c] = sc.nextInt();
				}
			}

			// max 선언후 행마다의 합과 비교해서 최종적으로 가장 큰 합이 max가 된다.
			int max = 0;
			for (int r = 0; r < 100; r++) {
				int sum = 0;
				for (int c = 0; c < 100; c++) {
					sum += arr[r][c];
				}
				if (max < sum) {
					max = sum;
				}
			}

			// 행의 최대 max에 이어 열마다의 합과 비교해서 최종적으로 가장 큰 합이 max가 된다.
			for (int c = 0; c < 100; c++) {
				int sum = 0;
				for (int r = 0; r < 100; r++) {
					sum += arr[r][c];
				}
				if (max < sum) {
					max = sum;
				}
			}

			// 행,열의 최대 max에 이어 두 대각선의 합과 비교해서 최종적으로 가장 큰 합이 max가 된다.

			// 대각선 1 계산
			int sum = 0;
			for (int r = 0, c = 0; r < 100 && c < 100; c++) {
				sum += arr[r][c];
			}
			if (max < sum) {
				max = sum;
			}
			sum = 0;

			// 대각선 2 계산
			for (int c = 0; c < 100; c++) {
				sum += arr[99 - c][c];
			}
			if (max < sum) {
				max = sum;
			}
			// 최종 케이스마다 max값 출력
			System.out.println("#" + T + " " + max);
		} // 전체 케이스 T번 end

	}
}
