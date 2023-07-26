import java.util.*;

class ama {
	static List<Integer> tree;

	static void update(int start, int end, int parent, long index) {
		if (start > end) {
			return;
		}
		if (start == end) {
			tree.set(parent, tree.get(parent) + 1);
			return;
		}
		int mid = (start + end) / 2;
		if (index > mid) {
			update(mid + 1, end, 2 * parent + 2, index);
		}
		else {
			update(start, mid, 2 * parent + 1, index);
		}
		tree.set(parent, tree.get(2 * parent + 1) + tree.get(2 * parent + 2));
	}

	static int query(int start, int end, int parent, int qstart, int qend) {
		if (qstart > end || qend < start) {
			return 0;
		}
		if (qstart <= start && qend >= end) {
			return tree.get(parent);
		}
		int mid = (start + end) / 2;
		int L = query(start, mid, 2 * parent + 1, qstart, qend);
		int R = query(mid + 1, end, 2 * parent + 2, qstart, qend);
		return L + R;
	}

	static int getSubsCount(String S) {
		int n = S.length();
		tree = new ArrayList<Integer>(Collections.nCopies(4 * 2 * n + 1, 0));

		int shift = n;
		long currSum = 0;
		long cnt = 0;

		update(0, 2 * n, 0, 0 + shift);

		for (int i = 0; i < n; i++) {
			currSum += (S.charAt(i) == '1' ? 1 : -1);

			/* prefix[j]-prefix[i]>=1
				=> prefix[i]<=1-prefix[j]
			*/

			int lessThan = (int) (currSum + shift) - 1;
			cnt += query(0, 2 * n, 0, 0, lessThan);

			update(0, 2 * n, 0, currSum + shift);
		}
		return (int) cnt;
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ans =0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
		    String input = sc.nextLine();
		    ans = getSubsCount(input);
            System.out.println(ans);
        }  
	}
}
