package sort;

import java.util.Arrays;

public class StringSort {
	 public static void main(String[] args) {
	  String ss[]={"ab","wang","hi","a","abff"};
	  MyString mySs[]=new MyString[ss.length];//创建自定义排序的数组
	  for (int i = 0; i < ss.length; i++) {
	   mySs[i]=new MyString(ss[i]);
	  }
	  Arrays.sort(mySs);//排序
	  for (int i = 0; i < mySs.length; i++) {
	   System.out.println(mySs[i].s);
	  }
	 }
	 
	}

	class MyString implements Comparable<MyString>{
	 public String s;//包装String
	 
	 public MyString(String s) {
	  this.s = s;
	 }

	 @Override
	 public int compareTo(MyString o) {
	  if(o==null||o.s==null) return 1;
	  if(s.length()>o.s.length()) return 1;
	  else if(s.length()<o.s.length()) return -1;
	  return s.compareTo(o.s);
	 }
	}