package sample_0414;

public class Car {
		private int man;//private �Ἥ �Ժη� ���� �ٲ�°� ���� �̷��� Human���� ������
		private int tire;
		private String color;
	

		public void setMan(int man){//�Է��� ����� ���ڸ� �ڵ����� �ְ� ����
		//man=man;�̷��� �ϸ� �򰥷�
		this.man=man;
		}
	
		public void getMan(){
			System.out.println(man);
		//	return man;   public int getMan������ return����� ��!!!!!!
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
