package model;

public class Product {

    private int id;
    private String name;
    private double price;
    private byte[] image;

    // ================================
    // Constructors
    // ================================

    // Empty constructor
    public Product() {}

    // Constructor for inserting new product (ID is auto-increment)
    public Product(String name, double price, byte[] image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    // Constructor for loading product from database
    public Product(int id, String name, double price, byte[] image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    // ================================
    // Getters and setters
    // ================================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
