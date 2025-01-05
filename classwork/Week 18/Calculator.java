public class Calculator {
    public static void main(String args[]) {
        Cal calc = new Cal();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.5f, 2.5f));
        System.out.println(calc.sum(1, 2, 3));
    }
}

class Cal {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }
    
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}