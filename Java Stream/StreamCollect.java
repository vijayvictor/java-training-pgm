package org.apijavastream.net;


	import java.util.*;  
	import java.util.stream.Collectors;  
	
	class StreamCollect{  
	    int id;  
	    String name;  
	    float price;  
	    public StreamCollect(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
	 class JavaStream {  
	    public static void main(String[] args) {  
	        List<StreamCollect> productsList = new ArrayList<StreamCollect>();  
	        //Adding Products  
	        productsList.add(new StreamCollect(1,"HP Laptop",25000f));  
	        productsList.add(new StreamCollect(2,"Dell Laptop",30000f));  
	        productsList.add(new StreamCollect(3,"Lenevo Laptop",28000f));  
	        productsList.add(new StreamCollect(4,"Sony Laptop",28000f));  
	        productsList.add(new StreamCollect(5,"Apple Laptop",90000f));  
	        // Using Collectors's method to sum the prices.  
	        double totalPrice3 = productsList.stream()  
	                        .collect(Collectors.summingDouble(product->product.price));  
	        System.out.println(totalPrice3);  
	          
	    }  
	}  

