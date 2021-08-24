package org.apijavastream.net;

	import java.util.*;  
	class Filter{  
	    int id;  
	    String name;  
	    float price;  
	    public Filter(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
	 class FilterStream {  
	    public static void main(String[] args) {  
	        List<Filter> productsList = new ArrayList<Filter>();  
	        //Adding Products  
	        productsList.add(new Filter(1,"HP Laptop",25000f));  
	        productsList.add(new Filter(2,"Dell Laptop",30000f));  
	        productsList.add(new Filter(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Filter(4,"Sony Laptop",28000f));  
	        productsList.add(new Filter(5,"Apple Laptop",90000f));  
	        // This is more compact approach for filtering data  
	        productsList.stream()  
	                             .filter(product -> product.price == 30000)  
	                             .forEach(product -> System.out.println(product.name));    
	    }  
	}  


