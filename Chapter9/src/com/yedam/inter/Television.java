package com.yedam.inter;

public class Television implements RemoteControl {

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("tv를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				// volume : 0 < volume < 10
				this.volume = volume;
				System.out.println("현재 Audio 볼륨 :" + this.volume);
			}
	}

}
