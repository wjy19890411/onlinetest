import java.util.HashMap;

//O(number of records)
public class Final {

	/**
	 * @param args
	 */
	
	//Scorelist has properties: sentinel, record
	//Record has properties: id, score
	
	public HashMap<Integer, int[]> top5andfinal(list){
		HashMap<Integer, int[]> hm = new HashMap();
		Record cur = new Record();
		cur = list.sentinel.next;
		while(cur != list.sentinel){
			if(!hm.containsKey(cur.id)){
				int[] A = new int[6];//A[0] average, A[1-5] top 5 scores, decreasing order
				for(int i = 0; i < 6; i++){
					A[i] = 0;
				}
				A[1] = cur.score;
				hm.put(cur.id, A);
			}
			else{
				insert(hm.get(cur.id), cur.score);
			}
		}
		for(Map.Entry<Integer, int[]> entry : hm.entrySet()){
			int[] A = entry.getValue();
			A[0] = (A[1] + A[2] + A[3] + A[4] + A[5])/5;
		}
		return hm;
	}
	
	public void insert(int[] A, int x){
		int temp = 0;
		for(int i = 1; i < 6; i++){
			if(A[i] < x){
				temp = x;
				x = A[i];
				A[i] = temp;
			}
		}
		return;
	}

}
