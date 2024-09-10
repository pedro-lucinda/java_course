package com.product;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Main class to test the Product class
 * 
 * @author Pedro
 */
public class ProductMain {
  public static void main(String[] args) {
    Product product = new Product("Laptop", "A powerful laptop", Arrays.asList("laptop", "electronics"),
        Arrays.asList("laptop.jpg"), "Electronics", new BigDecimal("999.99"), 5, true);

    System.out.println(product);

    try {
      product.purchase(2, new BigDecimal("1999.98"));
      System.out.println("Purchase successful! Remaining quantity: " + product.getQuantity());

      System.out.println("Tags before adding list: " + product.getTags());
      product.addTags(Arrays.asList("new tag 1", "new tag 2"));
      System.out.println("Tags after adding list: " + product.getTags());
    } catch (IllegalArgumentException e) {
      System.err.println("Purchase failed: " + e.getMessage());
    }
  }
}
