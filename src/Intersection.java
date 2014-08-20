import java.util.ArrayList;
import java.util.HashSet;


public class Intersection {

	/**
	 * @param args
	 */
	//O(numbers)
	public ArrayList<Integer> intersect(int[] A, int[] B){
		HashSet<Integer> ha = new HashSet<Integer>();
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		for(int i = 0; i < A.length; i++){
			ha.add(A[i]);
		}
		for(int i = 0; i < B.length; i++){
			if(ha.contains(B[i])){
				intersection.add(B[i]);
			}
		}
		return intersection;
		
	}
	
	
	
}
