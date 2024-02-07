
/*
 *-> Encapsulation: It is a process of wrapping data members and member functions together into a single unit.
 * 
 * 
 *-> Encapsulation is a protective shield that prevents the data from being accessed by the code outside this shield.

 */

class Account {

    // Declaration of instance variables.

    private String accName = "Hello";
    private int accbalance = 100;
    private int accNumber = 12345;
    private String email = " hello@gmail.in";
    private int phone = 1234567890;

    public int getAccbalance() {
        return accbalance;
    }

    public void setAccBalance(int val) {
        this.accbalance = val;

    }

    public String getAccName() {
        return this.accName;
    }

    public void setAccName(String val) {
        this.accName = val;
    }

    public int getAccNumber() {
        return this.accNumber;
    }

    public void setAccNumber(int val) {
        this.accNumber = val;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String val) {
        this.email = val;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int val) {
        this.phone = val;

    }

}

class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation
        Account a1 = new Account();

        // when all instance variables are public: we can access them like this: >>>
        // System.out.println("Account Name: " + a1.accName);
        // System.out.println("Account Balance: "+a1.accbalance);
        // System.out.println("Account Number: "+a1.accNumber);

        // when all instance variables are private: we can't access

        System.out.println("Old Account Name: " + a1.getAccName());
        System.out.println("Old Account Balance: " + a1.getAccbalance());
        System.out.println("Old Account Number: " + a1.getAccNumber());
        System.out.println("Old Email: " + a1.getEmail());
        System.out.println("Old Phone: " + a1.getPhone());

        System.out.println();
        a1.setAccName("Harpreet Singh");
        a1.setAccBalance(1050);
        a1.setAccNumber(164513);
        a1.setEmail("harpreet@123.in");
        a1.setPhone(746224407);

        System.out.println("New Account Name: " + a1.getAccName());
        System.out.println("Old Account Balance: " + a1.getAccbalance());
        System.out.println("New Account Number: " + a1.getAccNumber());
        System.out.println("New Email: " + a1.getEmail());
        System.out.println("New Phone: " + a1.getPhone());

    }
}
