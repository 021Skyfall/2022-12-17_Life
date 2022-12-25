public class OutputMethod {
    public static String a() { // 메소드의 리턴 이후 값이 실행 결과가 됨 => 리턴 값은 해당 메소드 종료 역할도 함
        // 메소드는 리턴 값이 어떤 데이터 값인지 정해줘야함
        return "The World End";
    }
    public static int one() {
        return 12341234;
    }

    public static void main(String[] args) { // void는 리턴 값이 없다는 뜻임

        System.out.println(a());
        System.out.println(one());

    }

}
