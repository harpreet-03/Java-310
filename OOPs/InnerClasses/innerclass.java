
class A {
    void test() {
        System.out.println("Test method of class A");
    }

    static class B {
        void test2() {
            System.out.println("Test method of class B");
        }

    }
}

public class innerclass {
    public static void main(String[] args) {
        A obj = new A();

        // access the enclosed class B:>>
        // A.B obj1 = obj.new B();

        // when the inner class is static
        A.B obj1 = new A.B();

        obj1.test2();

        /*
         * A obj = new A();: This line creates an instance of the outer class A and assigns it to the variable obj.
         * 
         * A.B obj1 = obj.new B();: This line creates an instance of the inner class B,
         * which is enclosed within the outer class A, using the instance of A (obj) to
         * access it. Since B is a non-static inner class, it needs an instance of the
         * outer class to be instantiated.
         * 
         * obj1.test2();: This line invokes the method test2() of the inner class B
         * through the object obj1.
         */
    }
}
