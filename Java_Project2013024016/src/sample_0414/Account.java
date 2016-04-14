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
			if(balance<1000000) this.balance=0;  //이렇게 하면 잘못들어온 값은 아예 돌지도 않음
			/*여기에 위내용 안집어넣으면 AccountTest에서 user1.setBalance 위에
			    if(input_data>1000000) System.out.println("error");이거 해야함
				246쪽 라인 중요한거임 에러 검정!!!!!!!!!!!!!!!!!
				*/
						this.balance = balance;
			
		}
	

}
