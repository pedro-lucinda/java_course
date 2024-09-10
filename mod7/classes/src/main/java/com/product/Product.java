package com.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Product class to represent a product in a store
 * 
 * @author Pedro
 * @version 1.0
 */

public class Product {
  private String name;
  private String description;
  private List<String> tags;
  private List<String> images;
  private String category;
  private BigDecimal price;
  private int quantity;
  private boolean isAvailable;

  public Product(String name, String description, List<String> tags, List<String> images, String category,
      BigDecimal price,
      int quantity, boolean isAvailable) {
    this.name = name;
    this.description = description;
    this.tags = new ArrayList<>(tags);
    this.images = new ArrayList<>(images);
    this.category = category;
    this.price = price;
    this.quantity = quantity;
    this.isAvailable = isAvailable;
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public List<String> getTags() {
    return tags;
  }

  public List<String> getImages() {
    return images;
  }

  public String getCategory() {
    return category;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public boolean getIsAvailable() {
    return isAvailable;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  // Methods
  /**
   * Purchase a product
   * 
   * @param quantity
   * @param amount
   * @throws IllegalArgumentException if the amount does not match the total price
   *                                  or if there is not enough stock to complete
   *                                  the purchase
   * @return void
   * @since 1.0
   * @version 1.0
   * @see IllegalArgumentException
   * @see BigDecimal
   * @see #getQuantity()
   */
  public void purchase(int quantity, BigDecimal amount) {
    BigDecimal totalPrice = this.price.multiply(BigDecimal.valueOf(quantity));
    int availableQuantity = getQuantity();

    if (amount.compareTo(totalPrice) == 0) {
      if (quantity > availableQuantity) {
        throw new IllegalArgumentException("Not enough stock to complete purchase");
      }
      availableQuantity -= quantity;
      if (availableQuantity == 0) {
        this.isAvailable = false;
      }
    } else {
      throw new IllegalArgumentException("Amount does not match the total price");
    }
  }

  /**
   * Add tags to the product
   * 
   * @param tags List of tags to add
   * @return void
   * @since 1.0
   * @version 1.0
   */
  public void addTags(List<String> tags) {
    this.tags.addAll(tags);
  }

}
