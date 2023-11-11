package Midterm;

public class ECarDriverProgram {

    public static void main(String[] args) {

        ECar ecar1 = new ECar(200, "Model Y");
        ECar ecar2 = new ECar(300, "Model X");
        System.out.println("ecar1 Model: " + ecar1.getModel());
        System.out.println("ecar1 Range: " + ecar1.getRange());
        ecar1.setRange(250);

        System.out.println("ecar1 Range: " + ecar1.getRange());

        System.out.println("ecar1 = " + ecar1);
        System.out.println("ecar2 = " + ecar2);

        int result = ecar1.compareTo(ecar2);
        System.out.println("result = " + result);

    }
}
