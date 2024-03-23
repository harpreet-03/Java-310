class A{
    public A(){
        System.out.println("A's constructor");
    }

    public A(int n) {
        System.out.println("From A int");
    }

    public A(int n1, int n2) {
        System.out.println("From A int int");
    }
}

class B extends A{
    public B(){
        // super();
        
        System.out.println("B's constructor");
    }

    public B(int n) {
        // super(5,10); //calls A3
        this();
        System.out.println("From B int");

    }
}

class superr{
    public static void main(String[] args) {
        // B b = new B();
        B b = new B(5);
    }
    /*
     * from a int
     * from b int
     */
    
}

//super constructor calls the constructor of parent class. for specific constructor to be called, signature should match.

//this() will call the constructor of same class

/* After creating the object of B and calling the constructor, before going to the B's constrcutor, its first calling the Parent class's constructor.
 * So, the output will be:
 * 
 * A's constructor
B's constructor
 */