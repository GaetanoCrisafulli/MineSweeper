package MineSweeper;

public class Cell {
    private String name;
    private String value;
    private boolean found;

    public Cell(String name,String value){
        this.name = name;
        this.value = value;
        this.found = false;
    }

    public void setName(String name){
        this.name = name;
    } 

    public String getName(){
        return this.name;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public void setFound(){
        this.found = true;
    }

    public boolean getFound(){
        return this.found;
    }
}