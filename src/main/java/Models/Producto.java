package Models;

import java.util.Random;
import Utils.RandomUtils;
public class Producto {

    private String id;
    private String name;
    private double price;

    /**
     * Constructores
     */
    public Producto(){
        this.id= RandomUtils.getId();
    }
    public Producto(String name, double price){
        this();
        this.name = name;
        this.price = price;
    }

    /**
     * Getters y Setters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
