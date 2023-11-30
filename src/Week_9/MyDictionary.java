package Week_9;

public class MyDictionary extends Dictionary{

    private String name;

    public MyDictionary(String name){
        super();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String printMyDict(){
        return name + ' '+ getDefinitions();
    }
}
