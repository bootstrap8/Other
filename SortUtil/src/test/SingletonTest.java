package test;

import org.junit.Test;

import sort.Singleton;

public class SingletonTest {

	@Test
	public void test() {
		Singleton s=Singleton.getInstance();
        s.setName("��Т��");
        System.out.println(s.getName());
        Singleton s1=Singleton.getInstance();
        s1.setName("��Т��");
        System.out.println(s1.getName());
        s.getInfo();
        s1.getInfo();
        if(s==s1){
            System.out.println("��������ͬһ��ʵ��");
        }else if(s!=s1){
            System.out.println("�����Ĳ���ͬһ��ʵ��");
        }else{
            System.out.println("application error");
        }
	}

}
