class Cal {
    public int add(int a, int b) {
        return a + b;
    }    
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    } 
    public String add(String a, String b) {
        return a + b;
    }
}

class Calculator {
    public static void main(String[] args) {
        Cal calc = new Cal();

        int sumint = calc.add(5, 10);
        System.out.println("Sum of integers: " + sumint);

        double sumdouble = calc.add(5.5, 10.5);
        System.out.println("Sum of doubles: " + sumdouble);

        int sumthree = calc.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sumthree);

        String concatenatedStrings = calc.add("Hey there,Rugved ", "Here!");
        System.out.println("Concatenated strings: " + concatenatedStrings);
    }
}
