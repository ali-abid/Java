package pattern.structural.adapter;
//This is adapter class
public class Engineer implements IOperateDevice {

	Device adaptee;
	public Engineer(){
		adaptee = new Device();
	}
	
	@Override
	public void operateDevice() {
		// TODO Auto-generated method stub
		adaptee.Start();
		adaptee.Stop();
	}
}
