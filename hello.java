package kkkkkkkkk;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[] = new int[] { Integer.MAX_VALUE, 100, 5, 6, 4, 10, 9, Integer.MAX_VALUE, 9, 11, 11, 9, 9 };
		int N[] = new int[M.length];
		boolean a = true;
		int n = 0;
		int b = 0;
		for (int i = 0; i < M.length; i++) {
			if (M[i] == Integer.MAX_VALUE) {
				a = false;
				b = i;
				break;
			}
		}

		for (int i = 0; i < M.length - 1; i++) {
			for (int j = i + 1; j < M.length; j++) {
				if (M[i] == M[j]) {
					M[j] = Integer.MAX_VALUE;
				}
			}
		}

		for (int i = 0; i < M.length; i++) {
			if (M[i] < Integer.MAX_VALUE) {
				N[n] = M[i];
				n++;
			}
		}
		M = N;
		if (a == false) {
			M[n] = Integer.MAX_VALUE;
			n = n + 1;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(M[i]);
		}

		for (int i = 0; i < n; i++) {
			if (i == b) {
				int temp = M[i];
				M[i] = M[n - 1];
				M[n - 1] = temp;
			}
		}
		System.out.println("------------");
		for (int i = 0; i < n; i++) {
			System.out.println(M[i]);
		}

	}

}
