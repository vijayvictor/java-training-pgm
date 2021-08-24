package org.apijavastream.net;

import java.util.*;  
import java.util.stream.Collectors;  
class ProductWS{  
    int id;  
    String name;  
    float price;  
    public ProductWS(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
 class JavaStreamExample {  
    public static void main(String[] args) {  
        List<ProductWS> productsList = new ArrayList<ProductWS>();  
        //Adding Products  
        productsList.add(new ProductWS(1,"HP Laptop",25000f));  
        productsList.add(new ProductWS(2,"Dell Laptop",30000f));  
        productsList.add(new ProductWS(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductWS(4,"Sony Laptop",28000f));  
        productsList.add(new ProductWS(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  
    }  
}  