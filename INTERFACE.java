/* The interface in Java is a mechanism to achieve abstraction. 
There can be only abstract methods in the Java interface, not method body. 
It is used to achieve abstraction and multiple inheritance in Java. */

interface Bank{
    double interest();
}

class SBI implements Bank{
    public double interest(){
        return 8.5;
    } 
}

class BOI implements Bank{
    public double interest(){
        return 7.5;
    }
}

class HDFC implements Bank{
    public double interest(){
        return 9.5;
    }
}

public class Main{
    public static void main (String[] args) {
        Bank obj1 = new SBI();
        Bank obj2 = new BOI();
        Bank obj3 = new HDFC();
        
        System.out.println("interest Rate of different Bank :");
        System.out.println("Rate of interest of SBI is : "+ obj1.interest());
        System.out.println("Rate of interest of BOI is : "+ obj2.interest());
        System.out.println("Rate of interest of HDFC is : "+ obj3.interest());
    }
}
