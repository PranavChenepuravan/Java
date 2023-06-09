class Complex 
{
    int r;
    int i;

    Complex(int re, int im)
    {
        this.r = re;
        this.i = im;
    }

    void show() 
    {
        System.out.println(r + " + " + i + "i");
    }

    static Complex add(Complex a, Complex b) 
    {
        int rea = a.r + b.r;
        int ima = a.i + b.i;
        Complex c = new Complex(rea, ima);
        return c;
    }
}

class Call 
{
    public static void main(String args[]) 
    {
        Complex a = new Complex(10, 5);
        a.show();
        Complex b = new Complex(12, 3);
        b.show();
        Complex result = Complex.add(a, b);
        System.out.println("Sum of the complex numbers is ");
        result.show();
    }
}






