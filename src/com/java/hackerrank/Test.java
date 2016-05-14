package com.java.hackerrank;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) {
		HowEqualWorks works = new HowEqualWorks();
		HowEqualWorks works2 = new HowEqualWorks();
		
		System.out.println(works.equals(works2));
		System.out.println(works == works2);
		System.out.println(works + "\n"+works2);
		int i = Integer.parseInt("15db9742", 16);
		System.out.println(i);
		works.equals(works2); 
	}

}
class HowEqualWorks{
	public int i = 5;
	public int j = 10;
	public boolean equals(Object obj){
		HowEqualWorks hit = (HowEqualWorks)obj;
		HowEqualWorks hit2= this;
		
		Class<HowEqualWorks> cls = (Class<HowEqualWorks>) hit2.getClass();
		Class<HowEqualWorks> cls2 =  (Class<HowEqualWorks>) hit.getClass();
		
		Field[] firstFields =  cls.getFields();
		Field[] secFields =  cls2.getFields();
		
		System.out.println(firstFields.length);
		System.out.println(secFields.length);
		
		boolean flag = false;
		
		for(int i = 0; i<firstFields.length;i++){
			System.out.println(firstFields[i]+"     "+secFields[i]);
			if(firstFields[i] == secFields[i]){
				flag = true;
			}else
				break;
		}
		
		return flag;
	}
}