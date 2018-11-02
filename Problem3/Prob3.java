
public class Prob3 {
	public static void main(String[] args) {
		Data x = new Data(9);
		x.add(1);
		x.add(5);
		x.add(8);
		x.add(10);
		x.add(14);
		x.add(18);
		x.add(20);
		x.add(33);
		x.add(41);
		ProblemThree(x,8);
		ProblemThree(x,33);
	}
	public static void ProblemThree(Data data, int val){
		int i = 0;
		while(data.getValue(i) <= val){
			i++;
		}
		System.out.println("The number of compares is " + i);
	}
}
