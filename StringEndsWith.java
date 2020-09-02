package StringEndsWith;
/*
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
 */

public class StringEndsWith {
    public static void main(String[] args) {
        System.out.println(solution("abc", "bc"));
        System.out.println(solution("", "a"));
    }

    public static boolean solution(String str, String ending) {
        if(str.equalsIgnoreCase("") || str.length()<ending.length()) {
            return false;
        }
        else if(ending.equalsIgnoreCase("")){
            return true;
        }
        else if(str.substring(str.length()-ending.length(), str.length()).equalsIgnoreCase(ending)){
            return true;
        }
        return false;
    }
}



