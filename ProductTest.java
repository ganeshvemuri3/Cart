package com.amazon.cart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.cart.dao.ProductDAO;
import com.amazon.cart.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
 context.scan("com.amazon.cart");
 context.refresh();
 ProductDAO ProductDAO =(ProductDAO) context.getBean("productDAO");
 Product Product =(Product) context.getBean("product");

Product.setId("mobile_22");
Product.setName("lenovo");
Product.setDescription("latest version");
Product.setPrice(10000);
ProductDAO.save(Product);

/*if(ProductDAO.save(Product)==true){
	System.out.println("a");
}
else{
	System.out.println("b");
}*/
	}

}
