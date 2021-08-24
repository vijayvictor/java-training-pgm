package org.apijavastream.net;

import java.util.*;  
	
class CountStream {
  
	    int id;  
	    String name;  
	    float price;  
	    public CountStream(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
	 class CountStreamEx {  
	    public static void main(String[] args) {  
	        List<CountStream> productsList = new ArrayList<CountStream>();  
	        //Adding Products  
	        productsList.add(new CountStream(1,"HP Laptop",25000f));  
	        productsList.add(new CountStream(2,"Dell Laptop",30000f));  
	        productsList.add(new CountStream(3,"Lenevo Laptop",28000f));  
	        productsList.add(new CountStream(4,"Sony Laptop",28000f));  
	        productsList.add(new CountStream(5,"Apple Laptop",90000f));  
	        // count number of products based on the filter  
	        long count = productsList.stream()  
	                    .filter(product->product.price>50000)  
	                    .count();  
	        System.out.println(count);  
	    }  
	}  

