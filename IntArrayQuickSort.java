package com.test;

abstract class ArraySort_quick {
        public static void operation(int[] n_array) {
                recursion(n_array, 0, n_array.length - 1);
        }

        public static void recursion(int[] n_array, int left, int right) {
                if (left < right) {
                        int copyLeft = left, copyRight = right, n_standard = n_array[left];

                        while (copyLeft < copyRight) {

                                while ((copyLeft < copyRight) && (n_standard <= n_array[copyRight])) {
                                        copyRight--;
                                }
                                if (copyLeft < copyRight) {
                                        n_array[copyLeft] = n_array[copyRight];
                                        copyLeft++;
                                }

                                while ((copyLeft < copyRight) && (n_array[copyLeft] <= n_standard)) {
                                        copyLeft++;
                                }
                                if (copyLeft < copyRight) {
                                        n_array[copyRight] = n_array[copyLeft];
                                        copyRight--;
                                }

                        }

                        n_array[copyLeft] = n_standard;

                        System.out.println("copyLeft和copyRight相等吗：" + (copyLeft == copyRight));

                        recursion(n_array, left, copyLeft - 1);
                        recursion(n_array, copyRight + 1, right);
                        //递归的好处就在这：不用深入去挖它的内部底层实现，说这步做好了，那就是做好了，可以接着考虑下一步。
                        //思维结构上，整个数据结构应该呈现相似形状态，结构一样，只是层层嵌套，越来越小了。

                }
        }
}
