
// how polymorphism can be achieved - 


class A{
    public void print() {
        System.out.println("A");
    
    }
}

class B extends A{
    // public void print() {
    //     System.out.println("B");
    // }

}

class C extends A{
    public void print() {
        System.out.println("C");
    }


}


public class P1 {
    public static void main(String[] args) {
        // poly(many) -  morphism(forms)

        // int a = 5, b = 10;
        // System.out.println(a + b + " ");

        // String c = "Hello", d = "World";
        // System.out.println(c + " " + d + " ");

        B b1 = new B();
        b1.print();

        C c1 = new C();
        c1.print();
        //output: 
        //A
        //C


    }
}

// if a mthd is defined in both parent and child class, then it will call the mthd of child class, this is called method overriding.


// if a mthd is defined in both parent and child class, then it will call the mthd of parent class, this is called method overloading.
