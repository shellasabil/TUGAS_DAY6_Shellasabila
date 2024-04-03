package com.example.tugas_day6;

public class Item {
    private String Name, Description, Price;
    private int ImageItem;
    private int id;

    public Item(int id, String name, String description, String price,  int imageItem) {
        this.id = id;
        Name = name;
        Description = description;
        Price = price;
        ImageItem = imageItem;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String deskripsi) {
        Description = deskripsi;
    }

    public String getPrice() { return Price; }

    public void setPrice(String harga) {
        Price = harga;
    }

    public int getImageItem() {
        return ImageItem;
    }

    public void setImageItem(int imageItem) {
        ImageItem = imageItem;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
