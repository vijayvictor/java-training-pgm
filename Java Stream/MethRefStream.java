package org.apijavastream.net;


	
	import java.util.*;  
	import java.util.stream.Collectors;  
	  
	class MethRefStream {  
	    int id;  
	    String name;  
	    float price;  
	      
	    public MethRefStream(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	          
	    public int getId() {  
	        return id;  
	    }  
	    public String getName() {  
	        return name;  
	    }  
	    public float getPrice() {  
	        return price;  
	    }  
	}  
	  
	 class MethRefStreamExample {  
	  
	    public static void main(String[] args) {  
	          
	        List<MethRefStream> productsList = new ArrayList<MethRefStream>();  
	          
	        //Adding Products  
	        productsList.add(new MethRefStream(1,"HP Laptop",25000f));  
	        productsList.add(new MethRefStream(2,"Dell Laptop",30000f));  
	        productsList.add(new MethRefStream(3,"Lenevo Laptop",28000f));  
	        productsList.add(new MethRefStream(4,"Sony Laptop",28000f));  
	        productsList.add(new MethRefStream(5,"Apple Laptop",90000f));  
	          
	        List<Float> productPriceList =   
	                productsList.stream()  
	                            .filter(p -> p.price > 30000) // filtering data  
	                            .map(MethRefStream::getPrice)         // fetching price by referring getPrice method  
	                            .collect(Collectors.toList());  // collecting as list  
	        System.out.println(productPriceList);  
	    }  
	}  


