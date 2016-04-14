package sample_0414;

public class Car {
		private int man;//private 써서 함부로 값이 바뀌는걸 예방 이러면 Human에서 에러뜸
		private int tire;
		private String color;
	

		public void setMan(int man){//입력한 사람의 숫자를 자동차에 주고 싶음
		//man=man;이렇게 하면 헷갈려
		this.man=man;
		}
	
		public void getMan(){
			System.out.println(man);
		//	return man;   public int getMan했으면 return써줘야 함!!!!!!
			}
		public void all_setting(int tire, String color){
			this.tire = tire;
			this.color=color;
		}
		
	
		void pr(){
				System.out.println("man : "+man+ " tire : "+tire+" color : "+color);//Human
		}
		

		
		public void xxxxx(int man, int tire, String color){
			this.man = man;
			this.tire=tire;
			this.color=color;
		}
}
