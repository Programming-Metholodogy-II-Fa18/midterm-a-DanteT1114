
public class Data {
	private int [] q;
	private int N;

	public Data(int capacity) {
		q = new int [capacity];
	}
	
	public void add(int a){
		if(N == 0) {
			q[0] = a;
			N++;
		}
		else{
			for(int i = q.length-1; i >0; i--){
				q[i] = q[i-1]; 
			}
			q[0] = a;
			N++;
		}
	}
	public int delete(){
		int holder = q[--N];
		q[N] = -1;
		return holder;
		
	}
	public int getValue(int i){
		if(i >= N) return -1;
		return q[N-i-1];
	}
	public void swap(int [] a, int x, int y){
		int holder = a[x];
		a[x] = a[y];
		a[y] = holder;
	}
}
