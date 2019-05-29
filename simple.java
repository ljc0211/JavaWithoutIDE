package template;
import java.util.*;


class Task {
	private String[] ss_exp = {"fwief", "fwiefei", "fwiefee"};
  private int[] nn_exp = {2, -1, 4, 0, 0, 0, 1, 3, -3};
	public Task() {

	}

	// 打印Int型数组。
	private void printIntArray(int[] nn_exp) {
		for (int n : nn_exp) {
			System.out.println(n);
		}
	}

  public List<List<Integer>> demo(int[] nn_exp) {
    List<List<Integer>> llist = new ArrayList<>();

		for (int i = 0; i < nn_exp.length - 2; i++) {
			for (int j = i + 1; j < nn_exp.length - 1; j++) {
				for (int k = j + 1; k < nn_exp.length; k++) {
					if ((nn_exp[i] + nn_exp[j] + nn_exp[k]) == 0) {
						List<Integer> list = new ArrayList<>();
						list.add(nn_exp[i]);
						list.add(nn_exp[j]);
						list.add(nn_exp[k]);
						llist.add(list);
					}
				}
			}
		}

		HashSet<List<Integer>> hsllist = new HashSet<>(llist);
	   List<List<Integer>> llistCopy = new ArrayList<>(hsllist);


// 只是测试 return 的基本返回功能。
		// for (int n : nn_exp) {
		// 	list.add(n);
		// }
		//
		// llist.add(list);
		// llist.add(list);

		return llistCopy;
  }

//  static 里面没有任何this指针，方法体无法识别这个变量到底属于哪一个类。
	public static void main(String[] args) {
    Task t1 = new Task();

		System.out.println(t1.demo(t1.nn_exp));

	}
}
