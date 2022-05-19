public class main {
    public static void main(String[] args) {//출력

        Bus b = new Bus(10);
        texi t = new texi(4885, "우리집");



        //주유량
        b.oil(11);

        //승객 수
        b.passenger(5,10);

        //요금
        b.pay(500);

        //속도
        b.speed(30,10);


        ///////////////////택//////////////시////////////////////////////////////


        System.out.println("///////////택시////////////////////");

        //택시번호
        System.out.println("택시 번호는 " + t.texiNum + "입니다.");
        //기름
        t.oil(5);
        //택시 상태
        t.getPass(true);
        //목적지
        System.out.println("목적지는 " + t.destination + "입니다.");
        //속도
        t.speed(30,-10);
        //결제
        t.pay(3000, 10, 5, 150);


    }
}