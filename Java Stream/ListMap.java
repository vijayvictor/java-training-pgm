package org.apijavastream.net;

import java.util.*;  
import java.util.stream.Collectors;  

	class ListMap{  
	    int id;  
	    String name;  
	    float price;  
	    public ListMap(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
	  
	 class ListMapStreamExample {  
	    public static void main(String[] args) {  
	        List<ListMap> productsList = new ArrayList<ListMap>();  
	  
	        //Adding Products  
	        productsList.add(new ListMap(1,"HP Laptop",25000f));  
	        productsList.add(new ListMap(2,"Dell Laptop",30000f));  
	        productsList.add(new ListMap(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ListMap(4,"Sony Laptop",28000f));  
	        productsList.add(new ListMap(5,"Apple Laptop",90000f));  
	          
	        // Converting Product List into a Map  
	        Map<Integer,String> productPriceMap =   
	            productsList.stream()  
	                        .collect(Collectors.toMap(p->p.id, p->p.name));  
	              
	        System.out.println(productPriceMap);  
	    }  
	}  

