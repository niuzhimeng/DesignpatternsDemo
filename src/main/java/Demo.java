class Base {
    private int i = 2;

    Base() {
        System.out.println(this.i);
        this.display();
    }

    public void display() {
        System.out.println("display");
        System.out.println(this.i);
    }
}

class Sub extends Base {
    private int i;

    Sub() {//这里会隐式调用super()
        i = 222;
    }

    @Override
    public void display() {
        System.out.println("zi - dispay");
        System.out.println(this.i);
    }
}

public class Demo {
    public static void main(String[] args) {
        new Sub();
    }
}
