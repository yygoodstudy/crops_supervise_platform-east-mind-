package com.example.oop;

/**
 * @Author yuanyao
 * @Date 2022/11/11
 */
public interface Cat extends Smilodon {
    String fish = "����";

    void play(); // ���󷽷�

    static void eat() {
        System.out.println("è����~");
    }

    default void run() { // �൱�ڳ������еķǳ���ķ������ýӿڵ�ʵ���඼��̳и÷�����Ҳ���ԶԸ÷���������д
        System.out.println("è�������е�ɢ��~��@");
    }

    default void climb() {
        System.out.println("è����������@#*&");
    }
}

@SuppressWarnings("all")
interface Smilodon {
    String name = "���ݻ�";

    default void hunting() {
        System.out.println("�ҽ�" + name + "������è������ȣ���ϲ��������");
    }
}

class OrangeCat implements Cat {
    @Override
    public void play() {
        System.out.println("è���ڳ�" + Cat.fish);
    }

    @Override
    public void hunting() {
        System.out.println("������è����ϲ�������");
    }
}

class MainTest {
    public static void main(String[] args) {
        OrangeCat orangeCat = new OrangeCat();
        orangeCat.play();
        orangeCat.climb();
//        orangeCat.hunting();

        Smilodon smilodon = new OrangeCat(); // ��������ָ��������󣬸��������ֻ�ܵ����ڸ����д��ڵķ��������ܵ����������еķ�����
        smilodon.hunting();
    }
}