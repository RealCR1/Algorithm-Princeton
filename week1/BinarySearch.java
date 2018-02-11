import java.util.Arrays;

public class BinarySearch {
	
	public static int rank(int key, int[] a){
		int l0 = 0;
		int hi = a.length - 1;
		while (l0 <= hi){
			int mid = l0 + (hi - l0)/2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key = a[mid])
				return mid;
			else (key > a[mid])
				l0 = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args){
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if(rank(key, whitelist) < 0){
				StdOut.println(key);
			}
	}	
}