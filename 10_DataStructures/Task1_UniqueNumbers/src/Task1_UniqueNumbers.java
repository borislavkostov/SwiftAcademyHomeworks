import java.util.HashSet;
import java.util.Scanner;

public class Task1_UniqueNumbers {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int e;
		HashSet<Integer> a = new HashSet<>();
		for (int i = 0; i < n; i++) {
			e = input.nextInt();
			a.add(e);
		}
		for (Integer integer : a) {
			System.out.print(integer);
		}
	}
}
