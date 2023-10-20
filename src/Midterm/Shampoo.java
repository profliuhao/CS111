package Midterm;

public class Shampoo {

    private String shapmpooName;
    private int weight;

    // constructor
    public Shampoo(String name, int w){
        shapmpooName = name;
        weight = w;
    }

    //getter for shapmpooName
    public String getShapmpooName() {
        return shapmpooName;
    }

    public void setShapmpooName(String newName){
        shapmpooName = newName;
    }
}
