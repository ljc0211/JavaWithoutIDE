package module;

class MyClass {
        private StringBuffer s_only5 = "只有五个字";
        public static void main(String[] args) {
                MyClass m_MyClass = new MyClass();
                System.out.println("s_only5的第五个字:" + m_MyClass.s_only5.charAt(5));
                System.out.println("s_only5的第六个字(越界):" + m_MyClass.s_only5.charAt(6));

                m_MyClass.s_only5.setLength(6);

                System.out.println("s_only5的第六个字(调用了s_only5.setLength(6)):" + m_MyClass.s_only5.charAt(6));
        }
}
