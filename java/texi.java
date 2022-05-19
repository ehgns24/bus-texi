public class texi {
    int texiNum;
    String destination;


    public texi(int texiNum, String destination) {
        this.texiNum = texiNum;
        this.destination = destination;
    }

    //주유량
    public void oil(int oil){
        if(oil>=10){
            System.out.println("현재 주유량은"+oil+"입니다.");
        }else{
            System.out.println("현재 주유량은"+oil+"입니다. 운행을 중단합니다.");
        }
    }


    //택시 상태
    public void getPass(boolean status){
        if(status==true){
            System.out.println("승객이 탑승했습니다.");
        }else{
            System.out.println("탑승불가");
        }
    }
    //속도
    public void speed(int nowSpeed, int addSpeed){
        nowSpeed+=addSpeed;
        System.out.println("현재속도는 "+nowSpeed+"입니다.");
    }



    //결제
    public void pay(int money,int defaultDistance, int distance, int distanceMoney){
        if(distance<=defaultDistance){
            System.out.println("요금은 "+money+"원 입니다.");
        }else{
            money+=distanceMoney*(distance-defaultDistance);
            System.out.println("요금은 "+money+"원 입니다.");
        }
    }


}



