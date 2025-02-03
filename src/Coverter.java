public class Coverter {
    public static void main (String[] args) {
       // Convert the string strFloat into a float.
        String strFloat = "374.25";
        float from_strFloat = Float.parseFloat(strFloat); // assign here
        System.out.println(strFloat);
        System.out.println(from_strFloat + 10.25); //for proof
        System.out.println( );

        // Convert the string strInt into an integer.
        String strInt = "1250";
        int from_strInt = Integer.parseInt(strInt); // assign here
        System.out.println(strInt);
        System.out.println(from_strInt + 10); //for proof
        System.out.println( );

        // Convert the float floatNum into an integer.
        float floatNum = 56.715f;
        int from_floatNum = (int) floatNum; // assign here
        System.out.println(from_floatNum);
        System.out.println( );

        // Convert the integer intNum into a float.
        int intNum = 1500;
        float from_intNum = (float) intNum; // assign here
        System.out.println(from_intNum);
        System.out.println( );

        // Convert the double doubleNum into a string.
        double doubleNum = 3.14159265;
        String from_doubleNum = String.valueOf(doubleNum); // assign here
        System.out.println(doubleNum);
        System.out.println(from_doubleNum + 2); //for proof

    }
}
