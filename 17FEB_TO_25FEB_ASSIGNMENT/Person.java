public class Person {
    // fields
    private String name;
    private String email;
    private String phoneNumber;

    // constructor
    public Person(String theName) {
        this.name = theName;
    }

    public Person(String theEmail, String thePhoneNumber) {
        this.email = theEmail;
        this.phoneNumber = thePhoneNumber;
    }

    // methods - getters
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // methods - setters
    public void setName(String theName) {
        this.name = theName;
    }

    public void setEmail(String theEmail) {
        this.email = theEmail;
    }

    public void setPhoneNumber(String thePhoneNumber) {
        this.phoneNumber = thePhoneNumber;
    }

    public String toString() {
        return this.name + " " + this.email + " " + this.phoneNumber;
    }

    // main method for testing
    public static void main(String[] args) {
        Person p1 = new Person("Sana");
        System.out.println(p1);
        Person p2 = new Person("Jean123@gmail.com", "2224561234");

        System.out.println(p2);
    }
}
