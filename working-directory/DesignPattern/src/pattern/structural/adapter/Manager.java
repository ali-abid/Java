package pattern.structural.adapter;

public class Manager implements IOperateDevice {

	IOperateDevice adapter;
	public Manager(){
		adapter = new Engineer();
	}

	@Override
	public void operateDevice() {
		// TODO Auto-generated method stub
		adapter.operateDevice();
	}
}
