package OutputPredict;

public class Ques3 {
    public static void main(String[] args){
        int a = 500; int b  = 100; int c;
        if(!(a >=400)) //Precidency rule >= more than !
            b = 300;
        c = 800;
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}
