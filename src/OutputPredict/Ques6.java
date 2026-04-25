package OutputPredict;

public class Ques6 {
    static void main() {
        int arr[] = {10,50,66,99,8};
        int a,b,c;
        a = ++arr[1];
        b = arr[1]++;
        c = arr[a++];
        System.out.println(a + b + c);
    }
}
