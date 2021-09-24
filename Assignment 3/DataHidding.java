package org.Assignment3.net;

import java.util.Scanner;

class DataHidding {
	
	private int id;
	private String name;
	private int age;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

 public static class Encapsulation
	{
		
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter id : ");
		int x = sc.nextInt();
		System.out.print("enter name : ");
		String y = sc.next();
		System.out.print("enter age : ");
		int z = sc.nextInt();
		sc.close();
		
    DataHidding dh = new DataHidding();
    dh.setId(x);
    dh.setName(y);
    dh.setAge(z);
    
    System.out.println("Encapsulation data fetching..................... ");
    
    System.out.println("Id   :" +dh.getId());
    System.out.println("Name :" +dh.getName());
    System.out.println("Age  :" +dh.getAge());
    
    
    
	}

}
}
