package kkkkkkkkk;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	int M[] = new int[] { 100, 100, 5, 6, 4, 10, 9,5, Integer.MAX_VALUE,9, 9 , 2,1,3,2,1,7,5,4,2,1,5,3,2,2,2,};
		int N[] = new int[M.length];
		boolean a = true;
		int n = 0;
		int b = 0;
		int h=M.length;
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i] + " ");
		}
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
		int count1=0;
		for (int i = 0; i < b; i++) {
			if(M[i]==Integer.MAX_VALUE) {
				count1++;
			}
		}
		int count=0;
		for (int i = 0; i < M.length - 1; i++) {
			if(M[i]==Integer.MAX_VALUE) {
				count++;
			}
		}
		for (int i = 0; i < M.length; i++) {
			if (M[i] < Integer.MAX_VALUE) {
				N[n] = M[i];
				n++;
			}
		}
		System.out.println();
		M = N;
		if (a == false) {
			M[n] = Integer.MAX_VALUE;
			n = n + 1;
			for (int i = 0; i < n; i++) {
				if (i >= b-count1) {
					int temp = M[i];
					M[i] = M[n-1];
					M[n-1] = temp;
				}
			}
		}
		System.out.println("------------");
		for (int i = 0; i < n; i++) {
			System.out.print(M[i] + " ");
		}
	}
}
