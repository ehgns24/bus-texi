public class Bus {//선언,함수
    boolean status = true;


    public Bus(int busNum){
        System.out.println("버스 번호는 "+busNum+"번 입니다.");
    }
    //주유량
    public void oil(int oil){
        if (oil <= 10 && oil!= 0) {
            System.out.println("기름을 확인해 주세요");
        } else if (oil == 0) {
            System.out.println("기름이 없습니다. 차고지로 돌아갑니다.");
            status = false;
            System.out.println("운행 종료 입니다.");
            return;
        } else {
            System.out.println("버스 운행합니다.");
        }
    }
    //승객탑승
    public void passenger(int passenger,int maxPassenger){
        if (passenger > maxPassenger) {
            System.out.println("최대 승객수는" + maxPassenger + ", 현재 승객수는" + passenger);
            System.out.println("승객 초과입니다. 운행을 중단합니다.");
            return;
        } else {
            System.out.println("현재 승객수는" + passenger);
        }

    }
    //요금
    public void pay(int money) {
        if (money < 1000) {
            System.out.println("요금이 부족하여 탑승하실 수 없습니다.");
            return;
        }else{
            System.out.println("요금"+money+"원 지불했습니다.");
        }
    }
    //속도
    public void speed(int nowSpeed, int addSpeed){
        nowSpeed+=addSpeed;
        System.out.println("현재 속도는"+nowSpeed+"kmh입니다.");
    }
}







