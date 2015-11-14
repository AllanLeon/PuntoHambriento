public class Reputation {
    
    private int id;
    private int level;
    private String comment;
    
    public Reputation (){}
    
    public Reputation(int level, String comment) {
        super();
        this.level = level;
        this.comment = comment;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    @Override
    public String toString() {
        return "Level [id=" + id + ", level=" + level + ", comment="
            + comment + "]";
    }
}