package Week_5;

public class DemoExample {

    public static void main(String[] args) {


        double number1 = 5.6;
        double number2 = 5.60000000000001;
        if (number1 == number2){
            System.out.println("Same!");
        }else{
            System.out.println("Not same!");
        }

        final double TOLERANCE = 0.000001;
        if (Math.abs(number1 - number2) < TOLERANCE) {
            System.out.println("Essentially Equal");
        }



        char chOne = '!';  // 33
        char chTwo = 'A';  // 65
        if (chOne < chTwo){
            System.out.println("first char comes first");
        }else{
            System.out.println("second char comes first");
        }

        String astr = "apple";
        String bstr = "banana";

//        bstr = astr;

        if(astr == bstr){
            System.out.println("Alias! Not the way to compare same string!");
        }

        if (astr.equals(bstr)){
            System.out.println("Same string!");
        }


        if(astr.compareTo(bstr) < 0){
            System.out.println("first string comes first");
        }else if (astr.compareTo(bstr) > 0){
            System.out.println("second strings comes first");
        }else{
            System.out.println("two strings are equal");
        }
    }
}
