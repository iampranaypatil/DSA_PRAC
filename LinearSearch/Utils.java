package LinearSearch;

public class Utils {
	public static int LinearSearch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
