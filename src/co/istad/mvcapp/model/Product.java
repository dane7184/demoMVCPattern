package co.istad.mvcapp.model;

import java.util.UUID;

public class Product {
    private UUID uuid;
    private Integer code;
    private String name;
    private Double priceIn;

    public Product(){

    }
    public Product(UUID uuid, Integer code, String name, Double prductId) {
        this.uuid = uuid;
        this.code = code;
        this.name = name;
        this.priceIn = prductId;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(Double priceIn) {
        this.priceIn = priceIn;
    }

    @Override
    public String toString() {
        return "Product{" +
                "uuid=" + uuid +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", prductId=" + priceIn +
                '}';
    }
}
