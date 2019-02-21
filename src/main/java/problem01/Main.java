package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		int[] marr = new int[10];
		//int max; //최대값
		//int n, m; //곱하면 최대값이 되는 두 수
		for(int i=0;i<10;i++) {
			for(int a=0;a<5;a++) {
				System.out.println(arr[a]*arr[a+1]);
			}
		}
		
		
	}
}
