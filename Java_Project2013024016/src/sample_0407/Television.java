package sample_0407;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	/*Television(int c, int v, boolean o){
		channel=c;
		volume=v;
		onOff=o;
	}*/
	
	void print(){
		System.out.println("ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�. ");
	}
	
	int changeChannel(int ch){
		channel=ch;
		return channel;
	}
	public Television(){
		this(10,20,false);//�̷��� ���� �ؿ� ó�� ������ �� �ʿ䰡 ����
		
		//this.channel=10;
		//this.volume=10;
		//this.onoff=true;
	}
	public Television(int channel, int volume){
		this(channel,volume,true);
	}
		public Television(int channel, int volume, boolean onOff){
			//this(10,20,false);�ϸ� �ȵǰ� this(10.23,20,false);�� ����  "recursive error"
			this.channel=channel;
			this.volume=volume;
			this.onOff=onOff;
		}
	
	
}
