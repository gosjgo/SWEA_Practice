package APSBasic_0808;

import java.util.Scanner;

public class SWEA_1206_view {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 10踰덈룞�븞 �뀒�뒪�듃 耳��씠�뒪瑜� 諛쏄린 �쐞�빐 諛섎났臾몄쓣 �룎由곕떎.
		for (int j = 1; j <= 10; j++) {
			// 嫄대Ъ�쓽 �닔�뿉 �뵲�씪 諛섎났�븯硫� 諛곗뿴�뿉 痢듭닔瑜� ���옣�븳�떎.
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			// 議곕쭩沅뚯씠 �솗蹂대맂 痢듭쓣 ���옣�븷 蹂��닔 greens瑜� �꽑�뼵�븳�떎.
			int greens = 0;
			// �븵�뿉�꽌 3踰덉㎏ 嫄대Ъ遺��꽣 �뮘�뿉�꽌 3踰덉㎏ 嫄대Ъ源뚯�
			// �븵�뮘濡� 1移� 2移� �뼥�뼱�졇�엳�뒗 嫄대Ъ�쓽 痢듭닔以묒뿉 媛��옣 �겙 �닔瑜� 援ы븯怨�
			// 洹� 痢듬낫�떎 �넂�� 痢듭쓣 議곕쭩沅� �솗蹂대맂 痢듭쑝濡� ���옣�븳�떎.
			for (int i = 2; i <= N - 3; i++) {
				int max = Math.max(Math.max(arr[i - 1], arr[i + 1]), Math.max(arr[i - 2], arr[i + 2]));
				if (arr[i] > max) {
					greens += arr[i] - max;
				}
			}
			System.out.printf("#%d %d\n", j, greens);
		}
	}
}
