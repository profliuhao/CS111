package Midterm;

public class ShampooDriver {

    public static void main(String[] args) {

        Shampoo sha1 = new Shampoo("Hes", 4);
        String name = sha1.getShapmpooName();
        System.out.println("name = " + name);
        sha1.setShapmpooName("new brand");
        System.out.println("new name is = " + sha1.getShapmpooName());

    }
}
