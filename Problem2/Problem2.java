
public class Problem2 {

	public static void main(String[] args) {
		Data x = new Data(6);
		x.add(1);
		x.add(9);
		x.add(4);
		x.add(5);
		x.add(10);
		x.add(0);
		System.out.println(x.getValue(0));
		System.out.println(x.getValue(3));

	}
}
