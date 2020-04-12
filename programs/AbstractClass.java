// abstract class Hello {
//     public abstract void display();
// }

// public class AbstractClass extends Hello{
//     public void display() {
//         System.out.println("hello rajan");
//     }
//     public static void main(String[] args) {
//         AbstractClass abs = new AbstractClass();
//         abs.display();
//     }
// }

// abstract class Hello {
//     public abstract void fun();
//     public void fun1() {
//         System.out.println("rajan");
//     }
// }

// public class AbstractClass extends Hello {
//     public void fun() {
//         System.out.println("singh");
//     }
//     public static void main(String[] args) {
//         AbstractClass abs = new AbstractClass();
//         abs.fun1();
//         abs.fun();
//     }
// }

abstract class Hello {
    public abstract void fun1();
}
abstract class Hello1 extends Hello {
    public abstract void fun2();
}

public class AbstractClass extends Hello1 {
    public void fun1() {
        System.out.println("rajan");
    }
    public void fun2() {
        System.out.println("singh");
    }
    public static void main(String[] args) {
        AbstractClass abs = new AbstractClass();
        abs.fun1();
        abs.fun2();
    } 
}