package iselectricaldevice;

public abstract class ElectricDevice {
    
    public enum State{
        ON, OFF
    }
    
    private ElectricDevice.State state;
    
    public ElectricDevice.State getState(){
        return state;
    }
    
    public void setState (ElectricDevice.State state){
        this.state = state;
    }
    
    protected abstract void turnOn();
    protected abstract void turnOff();
}
