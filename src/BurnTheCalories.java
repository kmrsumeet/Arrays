import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BurnTheCalories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n;
			n = sc.nextInt();
			Integer arr[] = new Integer[n];
			for(int i =0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr, Collections.reverseOrder());
			long caloriesBurned = 0;
			long d = 0;
			for(int i = 0;i<n;i++){
				caloriesBurned = caloriesBurned + (2*d)+arr[i];
				d = d + arr[i];
			}
			System.out.println(caloriesBurned);
			
		}

	}

}
