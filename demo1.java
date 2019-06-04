package template;

import java.util.*;

class list {
	private int[] nums = { 2, 3, 4, 5, 6, 7 };

	private List<Integer> list_n = new ArrayList<>();

	public list() {
		for (int n : nums) {
			list_n.add(n);
		}
		// 要测试的方法：
		testAddAll();
		testAddAndSet();
		testIndexOfAndLast();
		testSubList();
		printList_n();
	}

	// 正常输出：
	public void printList_n() {
		System.out.println("list_n:" + list_n);
	}

	// 以下：addAll()方法相关操作。
	public void testAddAll() {
		List<Integer> list_n2 = new ArrayList<>();
		list_n2.addAll(list_n);
		System.out.println("list_n2:" + list_n2);
		list_n.addAll(list_n2);
	}

	// 以下：add在此位置上填这个元素；set在此位置上换这个元素。
	public void testAddAndSet() {
		list_n.add(0, 3);
		list_n.add(0, 3);
		list_n.add(0, 3);
		list_n.set(1, 88);
	}

	// 以下：元素出现的索引位置。
	public void testIndexOfAndLast() {
		System.out.println("3的位置首次出现:" + list_n.indexOf(3));
		System.out.println("3的位置最后出现:" + list_n.lastIndexOf(3));
	}

	// 以下：截取List片段：(contains(x)是否包括x，返回boolean)
	public void testSubList() {
		System.out.println("截取list_n片段：" + list_n.subList(1, 4));

		System.out.println(list_n.contains(3));
	}
}
