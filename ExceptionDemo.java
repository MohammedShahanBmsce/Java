class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);   // Use parent Exception constructor
    }
}

class Father {
    int fage;

    Father(int age) throws WrongAge {
        if (age < 0)
            throw new WrongAge("Age can't be negative");
        fage = age;
    }
}

class Son extends Father {
    int sage;

    Son(int fage, int sage) throws WrongAge {
        super(fage);
        if (sage >= fage)
            throw new WrongAge("Son's age can't be more than father's age");
        this.sage = sage;
    }

    void display() {
        System.out.println("Father age is: " + fage);
        System.out.println("Son age is: " + sage);
    }
}

public class ExceptionDemo{
    public static void main(String[] args) {
        try {
            Son s = new Son(35, 25);
            s.display();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
