class Print {
    public String delimiter;
    public void a() { // 메소드가 인스턴스 소속일 때 static 제외, 클래스 소속일 때는 필요함
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    public static void c() {
        System.out.println("감오는데? 아닌가? 아닌가? 아닌가벼?");
    }
}

public class staticMethod {

    public static void main(String[] args) {
//        Print.a("!");
//        Print.b("?");
        Print t1 = new Print(); // instance
        t1.delimiter = "!";
        t1.a();
        t1.b();

//        Print.a("#");
//        Print.b("$");
        Print t2 = new Print(); // instance
        t2.delimiter = "?";
        t2.a();
        t2.b();

        Print.c();
    }
}