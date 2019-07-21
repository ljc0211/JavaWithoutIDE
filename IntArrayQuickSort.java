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

                        System.out.println("copyLeft��copyRight�����" + (copyLeft == copyRight));

                        recursion(n_array, left, copyLeft - 1);
                        recursion(n_array, copyRight + 1, right);
                        //�ݹ�ĺô������⣺��������ȥ�������ڲ��ײ�ʵ�֣�˵�ⲽ�����ˣ��Ǿ��������ˣ����Խ��ſ�����һ����
                        //˼ά�ṹ�ϣ��������ݽṹӦ�ó���������״̬���ṹһ����ֻ�ǲ��Ƕ�ף�Խ��ԽС�ˡ�

                }
        }
}
