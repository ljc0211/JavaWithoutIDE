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
                // 下面两个方法在子类中被重写了，因此父类的它们被隐藏，子类要调用它们却实际上调用了自己的，又因为这时候还在执行父类的初始化，子类的属性还没有初始化，所以就搞出了一堆null.
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
