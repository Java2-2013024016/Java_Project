package hw;

public class televisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   television myTv=new television();
		   myTv.channel=7;
		   myTv.volume=10;
		   myTv.onOff=true;
		   television yourTv=new television();
		   yourTv.channel=9;
		   yourTv.volume=12;
		   yourTv.onOff=true;
		   System.out.println("���� �ڷ������� ä����"+myTv.channel+"�̰� ������ "+myTv.volume+ "�Դϴ�.");
		   System.out.println("���� �ڷ������� ä����"+yourTv.channel+"�̰� ������ "+yourTv.volume+ "�Դϴ�.");
		}
	
	}


