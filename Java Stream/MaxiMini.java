package org.apijavastream.net;

	
	import java.util.*;    
	class MaxiMini {
	    int id;    
	    String name;    
	    float price;    
	    public MaxiMini(int id, String name, float price) {    
	        this.id = id;    
	        this.name = name;    
	        this.price = price;    
	    }    
	}    
	 class MaxiMiniStream {    
	    public static void main(String[] args) {    
	        List<MaxiMini> productsList = new ArrayList<MaxiMini>();    
	        //Adding Products    
	        productsList.add(new MaxiMini(1,"HP Laptop",25000f));    
	        productsList.add(new MaxiMini(2,"Dell Laptop",30000f));    
	        productsList.add(new MaxiMini(3,"Lenevo Laptop",28000f));    
	        productsList.add(new MaxiMini(4,"Sony Laptop",28000f));    
	        productsList.add(new MaxiMini(5,"Apple Laptop",90000f));    
	        // max() method to get max Product price     
	        MaxiMini productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();    
	        System.out.println(productA.price);    
	        // min() method to get min Product price    
	        MaxiMini productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
	        System.out.println(productB.price);    
	            
	    }    
	}    


