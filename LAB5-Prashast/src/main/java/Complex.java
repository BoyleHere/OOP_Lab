public class Complex {
    
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) 
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void display() 
    {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }

 
    public Complex add1(int num, Complex c) 
    {
        double r = real + num;
        double i = imaginary + c.imaginary;
        return new Complex(r, i);
    }

   
    public Complex add2(Complex c1, Complex c2) 
    {
        double r = c1.real + c2.real;
        double i = c1.imaginary + c2.imaginary;
        return new Complex(r, i);
    }

    public static void main(String[] args) 
    {
        
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, -5);

        System.out.print("Complex Number 1: ");
        c1.display();

        System.out.print("Complex Number 2: ");
        c2.display();

        Complex result1 = c1.add1(5, c2);
        System.out.print("Result of addition 1: ");
        result1.display();

        Complex result2 = c1.add2(c1, c2);
        System.out.print("Result of addition 2: ");
        result2.display();
        
    }
    
    
}

