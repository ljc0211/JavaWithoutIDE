package com.ljc;

class Dervied extends Base {


        private String name = "Java3y";

        public Dervied() {
                tellName();
                printName();
        }

        public void tellName() {
                System.out.println("(mark!)");
                System.out.println("Dervied tell name: " + name);
        }

        public void printName() {
                System.out.println("(mark!)");
                System.out.println("Dervied print name: " + name);
        }

        public static void main(String[] args) {
                // new Base();
                new Dervied();
        }
}
class Base {

        private String name = "ASD";

        public Base() {

                System.out.println("Ahhhhhhhhhhhhhhh!");
                // �������������������б���д�ˣ���˸�������Ǳ����أ�����Ҫ��������ȴʵ���ϵ������Լ��ģ�����Ϊ��ʱ����ִ�и���ĳ�ʼ������������Ի�û�г�ʼ�������Ծ͸����һ��null.
                tellName();
                printName();
        }

        // {
        //         System.out.println("Why so strange?");
        // }

        public void tellName() {
                System.out.println("Base tell name: " + name);
        }

        public void printName() {
                System.out.println("Base print name: " + name);
        }
}
