package org.apijavastream.net;
import java.util.*;  

	class ReduceStream
	{  
	    int id;  
	    String name;  
	    float price; 
	    
	    public ReduceStream(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
	 class StreamMethod {  
	    public static void main(String[] args) {  
	        List<ReduceStream> productsList = new ArrayList<ReduceStream>();  
	        //Adding Products  
	        productsList.add(new ReduceStream(1,"HP Laptop",25000f));  
	        productsList.add(new ReduceStream(2,"Dell Laptop",30000f));  
	        productsList.add(new ReduceStream(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ReduceStream(4,"Sony Laptop",28000f));  
	        productsList.add(new ReduceStream(5,"Apple Laptop",90000f));  
	        // This is more compact approach for filtering data  
	        Float totalPrice = productsList.stream()  
	                    .map(product->product.price)  
	                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
	        System.out.println(totalPrice);  
	        // More precise code   
	        float totalPrice2 = productsList.stream()  
	                .map(product->product.price)  
	                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
	        System.out.println(totalPrice2);  
	          
	    }  
	}  


