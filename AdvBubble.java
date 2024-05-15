
public class AdvBubble {		//Recursive Advanced Bubble Sort
	

	public static < T extends Comparable<T>> void bubble(T[] a, int count) {
		//outer loop of bubble sort
		
		if(count == 1){		//base case	
			return;
		}
		else {
			System.out.println("Count: " + count);
			boolean swapped = pass(a, 0, count, false);	
			if(swapped) bubble(a, count - 1);
		}
	}
	
	public static < T extends Comparable<T>>boolean pass(T[] a, int i, int count, boolean swapped) {	
		//goes through the array and swaps largest to the end, the inner loop of bubble sort
		
		if(i == count - 1) {	//base case
			return swapped;
		}
		else {
			if(a[i].compareTo( a[i + 1]) > 0) { 
				swap(a, i, i + 1);
				swapped = true;
			}
			i++;
			return pass(a, i, count, swapped);
			
		}
	}
	
	
	public static void main(String[] args) {
			int num = 10;
			Integer[] grades = {7,5,4,3,2,1,6,9,8,10};
			Integer[] grades1 = {1,2,3,4,5,6,7,8,9,10};
			Integer[] grades2 = {5,7,3,10,1,4,9,2,6,8};
			String[] names = {"b", "d", "e", "j", "a", "c", "f", "g", "h", "i"};
			
			
			bubble(names, num);
		

		for(int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");
		
	}
	
	public static < T > void swap(T[] a, int i, int j) {
		T t = a[i]; a[i] = a[j]; a[j] = t;
	}

}

/* Regular advanced bubble
 * 
 
for(int i = 0; i < num-1; i++) {
 boolean swapped = false;
 for(int j = 0; j < num-1-i; j++) {
 if(grades[j] > grades[j+1]) {
 swap(grades, j, j+1);
 swapped = true;
 }
 }
 if(!swapped) break;
}
*/


/*if(swapped)
	return true;
else
	return false;
	*/