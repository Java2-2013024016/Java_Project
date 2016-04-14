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
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다. ");
	}
	
	int changeChannel(int ch){
		channel=ch;
		return channel;
	}
	public Television(){
		this(10,20,false);//이렇게 쓰면 밑에 처럼 여러개 쓸 필요가 없다
		
		//this.channel=10;
		//this.volume=10;
		//this.onoff=true;
	}
	public Television(int channel, int volume){
		this(channel,volume,true);
	}
		public Television(int channel, int volume, boolean onOff){
			//this(10,20,false);하면 안되고 this(10.23,20,false);는 가능  "recursive error"
			this.channel=channel;
			this.volume=volume;
			this.onOff=onOff;
		}
	
	
}
