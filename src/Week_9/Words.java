package Week_9;//********************************************************************
//  Words.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an inherited method.
//********************************************************************

public class Words
{
    //-----------------------------------------------------------------
    //  Instantiates a derived class and invokes its inherited and
    //  local methods.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Dictionary webster = new Dictionary();

        System.out.println("Number of pages: " + webster.getPages());

        System.out.println("Number of definitions: " +
                           webster.getDefinitions());

        System.out.println("Definitions per page: " +
                           webster.computeRatio());

        MyDictionary mydict = new MyDictionary("Testing New Name");
        System.out.println("mydict.printMyDict() = " + mydict.printMyDict());
        System.out.println("mydict.getDefinitions() = " + mydict.getDefinitions());
        System.out.println("mydict.getPages() = " + mydict.getPages());
    }
}
