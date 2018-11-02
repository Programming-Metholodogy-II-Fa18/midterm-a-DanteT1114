
public class ExamSort {
	public static void main(String[] args) {
		int[] a = {15,9,60,44,12,1,4};
		ExamSort(a, a.length);
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void ExamSort(int[] a, int N) {
		int[] aux = new int[a.length];
		ExamSort(a, aux, 0, a.length - 1);
	}

	public static void ExamSort(int[] a, int[] aux, int lo, int hi) {
		if (hi <= lo)
			return;
		int mid = (hi + lo) / 2;
		ExamSort(a, aux, lo, mid);
		ExamSort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

	public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		int i = lo;
		int j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (aux[j] < aux[i])
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
	}
}
