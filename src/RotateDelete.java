import java.util.ArrayList;
import java.util.Scanner;

public class RotateDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n;
			n = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>(n);
			for(int i=0;i<n;i++){
				int k = sc.nextInt();
				list.add(k);
			}
			int c = n;
			int j=0;
			while(c!=1){
				int k = list.get(c-1);
				list.add(0,k);
				list.remove(c-j);
				j++;
				c--;
			}
			System.out.print(list.get(0));
		}

	}

}
