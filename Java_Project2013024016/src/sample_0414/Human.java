package sample_0414;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();//아무런 인자도 주지 않은 생성자는 자동으로 있음
		c1.setMan(4);
		c1.getMan();
		c1.all_setting(3,"red");  //Car 클래스에서 public void all_setting
		
		
		//Car클래스에서 return문썼으니까 여기서int c1man써줘야 되는데 그냥 귀찮아서 Car클래스에 프린트 시킴
		/*	c1.man=4; 
		c1.tire=3;
		c1.color="red";  //Car먼저 만든후 */  // 주석처리한 이유: 앞에서 private해서
		//따라서 Car에 public으로 뭔가를 만들어서 접근할수 있게끔 한다
		
		
		//자동차 기본성능 출력하는 method 만들고자 함
		//Car 클래스에 돌아가서 void pr만들기
		
		c1.pr(); //void pr 호출   
		
		
		
	}

}
