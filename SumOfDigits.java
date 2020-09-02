package SumOfDigits;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(add(248, 33208));

    }

    public static int add(int num1,int num2){
        String numStringA = String.valueOf(num1);
        String numStringB = String.valueOf(num2);
        String totalResult = "";
        String remaining = "";
        String result = "";
        System.out.println();


        if(numStringA.length() >= numStringB.length()){
            remaining = numStringA.substring(0, numStringA.length()-numStringB.length());

            for (int i = 0; i < numStringB.length() ; i++) {
                result += String.valueOf(Integer.parseInt(""+ numStringB.charAt(i)) + Integer.parseInt(numStringA.charAt(i + remaining.length()) + ""));
            }
            totalResult = numStringA.substring(0, remaining.length()) + result;
            return Integer.parseInt(totalResult);
        }else {
            remaining = numStringB.substring(0, numStringB.length()-numStringA.length());
            for (int i = 0; i < numStringA.length(); i++) {
                result += String.valueOf(Integer.parseInt(""+ numStringB.charAt(i + remaining.length())) + Integer.parseInt(numStringA.charAt(i ) + ""));
            }

            totalResult = numStringB.substring(0, remaining.length()) + result;
            return Integer.parseInt(totalResult);
        }



    }


}
