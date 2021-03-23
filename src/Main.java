
public class Main {
	public static void main(String[] args) {
		int sum = 0;
		int[][] myarray = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		for (int i = 0; i < myarray.length; i++) {
			for (int j = 0; j < myarray[i].length; j++) {
				System.out.println(myarray[i][j]);
				if (j == myarray[i].length - 1) {
					sum += myarray[i][j];
				}
			}
		}
		System.out.println("sum = " + sum);
		;
	}
}
