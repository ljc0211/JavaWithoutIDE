
package com.ljc;


//�Ⱦ�̬��ʼ������ֻ��һ�Σ���Ȼ�������飡���ٹ��췽������
//����һ���̳��Ը��������ʱ���ȰѸ���Ĺ������鼰���췽����ʼ��Ȼ���ʼ������Ĺ�������͹��췽��

class Parent {
        public static String p_StaticField = "����--��̬����";
        public String p_Field = "����--����";
        // �����

        // {
        //         System.out.println(p_StaticField);
        //         System.out.println("����--��ͨ��ʼ����");
        // }

        // ���캯��

        public Parent() {
                System.out.println("����--������");
        }

        // �����
        {
                System.out.println(p_Field);
                System.out.println("����--��ʼ����");
        }

        // ��̬��ʼ����
        static {
                System.out.println(p_StaticField);
                System.out.println("����--��̬��ʼ����");
        }
}

class StaticBlock extends Parent {
        // ��̬��ʼ����

				public static String s_StaticField = "����--��̬����";
        public String s_Field = "����--����";

				static {
								System.out.println(s_StaticField);
								System.out.println("����--��̬��ʼ����");
				}

        {
                System.out.println(s_Field);
                System.out.println("����--��ʼ����");
        }


        public StaticBlock() {
                System.out.println("����--������");
				        System.out.println(s_Field);
        }

        public static void main(String[] args) {
                // System.out.println("-------------------");
                // new Parent();
                System.out.println("-------------------");
                new StaticBlock();
                System.out.println("-------------------���ǵ����ε��������ˣ���Щ������ô������-------------------");
                new StaticBlock();
                System.out.println("-------------------���ǵ����ε��������ˣ���Щ������ô������-------------------");
                new StaticBlock();
        }
}
