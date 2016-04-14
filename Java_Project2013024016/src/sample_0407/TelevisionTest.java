package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv=new Television(7,10,true);//볼륨이 10인지 channel 이 10인지 명시해줘야 되기 때문에!그냥 10이라고만 쓰면 에러뜸
		/*Television myTv=new Television(); 이거 에러뜸
		 이유: 이렇게 입력하면 아무 인자도 안받는 생성자를 또 만들어야 됨 */
		/*public Television(){
		 this.channel=10;
		 this.volume=19;
		 this.onOff=true; 따라서 위에처럼 하지말고 이렇게 생성자를 추가로 입력하면 함수 overloading 에의해서 잘 돌아감
		 "method overloading"은 인자로 구분!
		 }*/
		myTv.print();
		Television yourTv= new Television(11,20,true);
		yourTv.print();
		
	}

}
/*
Television testTv=new Television();
testTv=myTv;  //값을 가져오는 것이 아니라 주소값을 복사한거라서 myTV를 가리키고 있는 상태임
testTv.channel=536;

myTv.print();

Television yourTv=new Television();
yourTv.channel=9;
yourTv.volume=12;
yourTv.onOff=true;

System.out.println("current channel : "+yourTv.changeChannel(24));

System.out.println(myTv.channel+" "+myTv.volume+" "+myTv.onOff);
System.out.println(yourTv.channel+" "+yourTv.volume+" "+yourTv.onOff);
System.out.println(testTv.channel);*/