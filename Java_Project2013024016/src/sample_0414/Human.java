package sample_0414;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();//�ƹ��� ���ڵ� ���� ���� �����ڴ� �ڵ����� ����
		c1.setMan(4);
		c1.getMan();
		c1.all_setting(3,"red");  //Car Ŭ�������� public void all_setting
		
		
		//CarŬ�������� return�������ϱ� ���⼭int c1man����� �Ǵµ� �׳� �����Ƽ� CarŬ������ ����Ʈ ��Ŵ
		/*	c1.man=4; 
		c1.tire=3;
		c1.color="red";  //Car���� ������ */  // �ּ�ó���� ����: �տ��� private�ؼ�
		//���� Car�� public���� ������ ���� �����Ҽ� �ְԲ� �Ѵ�
		
		
		//�ڵ��� �⺻���� ����ϴ� method ������� ��
		//Car Ŭ������ ���ư��� void pr�����
		
		c1.pr(); //void pr ȣ��   
		
		
		
	}

}
