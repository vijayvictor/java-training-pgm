package org.apijavastream.net;

import java.util.*;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
class WoStream {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        List<String> productNameList = new ArrayList<String>();
        List<Integer> productIdList = new ArrayList<Integer>();
        for(Product product: productsList){  
              
            // filtering data of list  
            if(product.price<30000){  
            	productIdList.add(product.id);
            	productNameList.add(product.name);
            	productPriceList.add(product.price);    // adding price to a productPriceList
            	
                
            }  
        }  
        System.out.println(productIdList);
        System.out.println(productPriceList);   // displaying data  
        System.out.println(productNameList);
    }  
}  