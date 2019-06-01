// 哈希表算法搜索所有能凑成指定和的整形数组合。
package com.threesum_15;
import java.util.*;

class Task {

        private int[] nn_exp = {5, 4, 2, 1, 3, 5, 1, 0, 7};

        // TODO: 普通算法搜索
        private List<List<Integer> > normalSearch(int[] nums) {
                List<List<Integer> > llist_n = new ArrayList<>();

                // Arrays.sort(nums);

                for (int i = 0; i < nums.length - 1; i++) {
                        for (int j = i + 1; j < nums.length; j++) {
                                if ((nums[i] + nums[j]) == 7) {
                                        List<Integer> list_n = new ArrayList<>();
                                        list_n.add(nums[i]);
                                        list_n.add(nums[j]);
                                        llist_n.add(list_n);
                                }
                        }
                }

                HashSet<List<Integer> > hlist_n = new HashSet<>(llist_n);
                List<List<Integer> > llist_n2 = new ArrayList<>(hlist_n);

                return llist_n2;
        }

        // TODO：哈希表算法搜索
        private List<List<Integer> > hashSearch(int[] nums) {

                List<List<Integer> > llist_n = new ArrayList<>();

                Arrays.sort(nums);

                int[] expForHash = new int[nums.length];

                Arrays.fill(expForHash, 9999);

                for (int i = 0; i < nums.length; i++) {
                        if (expForHash[nums[i]] != 9999) {
                                List<Integer> list_n = new ArrayList<>();
                                list_n.add(nums[i]);
                                list_n.add(expForHash[nums[i]]);
                                llist_n.add(list_n);
                        }
                        else {
                                expForHash[8 - nums[i]] = nums[i];
                        }
                }

                HashSet<List<Integer> > hlist_n = new HashSet<>(llist_n);
                List<List<Integer> > llist_n2 = new ArrayList<>(hlist_n);

                return llist_n2;
        }

        public static void main(String[] args) {
                Task t1 = new Task();
                System.out.println(t1.hashSearch(t1.nn_exp));
        }
}
