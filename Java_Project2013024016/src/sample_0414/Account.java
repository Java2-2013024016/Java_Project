package sample_0414;

public class Account {
		private int regNumber;
		private String name;
		private int balance;
		public int getRegNumber() {
			return regNumber;
		}
		public void setRegNumber(int regNumber) {
			this.regNumber = regNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			if(balance<1000000) this.balance=0;  //�̷��� �ϸ� �߸����� ���� �ƿ� ������ ����
			/*���⿡ ������ ����������� AccountTest���� user1.setBalance ����
			    if(input_data>1000000) System.out.println("error");�̰� �ؾ���
				246�� ���� �߿��Ѱ��� ���� ����!!!!!!!!!!!!!!!!!
				*/
						this.balance = balance;
			
		}
	

}
