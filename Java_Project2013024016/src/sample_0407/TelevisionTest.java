package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv=new Television(7,10,true);//������ 10���� channel �� 10���� �������� �Ǳ� ������!�׳� 10�̶�� ���� ������
		/*Television myTv=new Television(); �̰� ������
		 ����: �̷��� �Է��ϸ� �ƹ� ���ڵ� �ȹ޴� �����ڸ� �� ������ �� */
		/*public Television(){
		 this.channel=10;
		 this.volume=19;
		 this.onOff=true; ���� ����ó�� �������� �̷��� �����ڸ� �߰��� �Է��ϸ� �Լ� overloading �����ؼ� �� ���ư�
		 "method overloading"�� ���ڷ� ����!
		 }*/
		myTv.print();
		Television yourTv= new Television(11,20,true);
		yourTv.print();
		
	}

}
/*
Television testTv=new Television();
testTv=myTv;  //���� �������� ���� �ƴ϶� �ּҰ��� �����ѰŶ� myTV�� ����Ű�� �ִ� ������
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