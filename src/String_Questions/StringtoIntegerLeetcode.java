package String_Questions;

/*
        1.Whitespace
        2.+ sign or - sign
        3. String to int conversion
        4. Integer 32 bit overflow
         */

public class StringtoIntegerLeetcode {
    public static int calcStringtoIntegerLeetcode(String str){
        int i = 0;int sum = 0;
        int n = str.length();
        while(i<n && str.charAt(i)==' '){ //WhiteSpace
            i++;
        }
        int sign = 1; //Sign + or -
        if(str.charAt(i)=='+')
            i++;
        else if(str.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        while(i<n){
            char ch = str.charAt(i);
            if(ch<'0' || ch>'9')
                break;
            int digit = ch - '0';
            if(sum >= Integer.MAX_VALUE/10 && digit>7) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            }
            sum = sum*10 + digit;
            i++;

        }
        return sign*sum;
    }
    public static void main(String[] args){
        String s1 = "42";
        String s2 = "-042";
        String s3 = "1337c0d3";
        String s4 = "0-1";
        String s5 = "words and 987";
        System.out.println(calcStringtoIntegerLeetcode(s1));
        System.out.println(calcStringtoIntegerLeetcode(s2));
        System.out.println(calcStringtoIntegerLeetcode(s3));
        System.out.println(calcStringtoIntegerLeetcode(s4));
        System.out.println(calcStringtoIntegerLeetcode(s5));
    }
}
