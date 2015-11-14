public class Plate {
    
    private int id;
    private String name;
    private String description;
    private int price;
    private String img;
    
    public Plate(){}
    
    public Plate(String name, String description, int price, String img) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
        this.img = img;
    }
    
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    
    @Override
    public String toString() {
        return "Plate [id=" + id + ", name=" + name + ", description=" 
           + description + ", price=" + price + ", img=" + img + "]";
 }
}