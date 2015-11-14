public class Category {
    
    private int id;
    private String name;
    private String img;
    
    public Category(){}
    
    public Category(String name, String img) {
        super();
        this.name = name;
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
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    
    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", img=" + img
            + "]";
    }
}