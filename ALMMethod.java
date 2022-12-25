class Greeting {
    //public : 전역, protected, default, private : 각 클래스 안에서만
    public static void hi() {
        System.out.println("Hi");
    }
}

public class ALMMethod {

    public static void main(String[] args) {
        Greeting.hi ();
    }
}
