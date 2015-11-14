public class Casera {
    
    private int id;
    private String name;
    private int type; //debe ser int? 1restaurante, 2casera, 3tienda, 4café, 5bar
    private int telephone;
    private String description;
    
    public Casera (){}
    
    public Casera(String name, int type, int telephone, 
                  String description) {
        super();
        this.name = name;
        this.type = type;
        this.telephone = telephone;
        this.description = description;
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
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int type) {
        this.telephone = telephone;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Casera [id=" + id + ", name=" + name + ", type=" + type + 
           ", telephone=" + telephone + ", description=" + description + "]";
 }
}