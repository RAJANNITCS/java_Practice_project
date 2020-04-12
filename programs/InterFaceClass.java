// interface Hello {
//     public static final int COUNT = 5;
//     public abstract void fun1();
// }

// public class InterFaceClass implements Hello {
//     public void fun1() {
//         System.out.println("count ="+ COUNT);
//     }
//     public static void main(String[] args) {
//         InterFaceClass i1 = new InterFaceClass();
//         i1.fun1();
//     }
// }

// interface Hello {
//     public static final int COUNT = 5;
//     public abstract void fun1();
// }
// interface Hello1 {
//     public static final int NUMBER = 8;
//     public abstract void fun2();
// }

// public class InterFaceClass implements Hello,Hello1{ 
//     public void fun1() {
//         System.out.println("count is ="+COUNT);
//     }
//     public void fun2() {
//         System.out.println("number is = "+ NUMBER);
//     }
//     public static void main(String[] args) {
//         InterFaceClass i1 = new InterFaceClass();
//         i1.fun1();
//         i1.fun2();
//     }

// }

// interface Hello {
//     public static final int COUNT =5;
//     public abstract void fun1();
// }

// class Hello1 {
//     private String name = "rajan";
    
//     public void fun2() {
//         System.out.println("name is "+name);
//     }
// }

// public class InterFaceClass extends Hello1 implements Hello {
//     public void fun1() {
//         System.out.println("interface class");
//     }
//     public static void main(String[] args) {
//         InterFaceClass i1 = new InterFaceClass();
//         i1.fun1();
//         i1.fun2();
//     }
// }

interface Hello {
    public static final int COUNT = 4;
    public abstract void fun1();
}
interface Hello1 extends Hello{ 
    public abstract void fun2();
}

public class InterFaceClass implements Hello1 {
    public void fun2() {
        System.out.println("this is hello 1");
    }
    public void fun1() {
        System.out.println("this is Hello ");
    }
    public static void main(String[] args) {
        InterFaceClass i1 = new InterFaceClass();
        i1.fun1();
        i1.fun2();
    }
}